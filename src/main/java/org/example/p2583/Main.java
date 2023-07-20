package org.example.p2583;

import java.io.*;
import java.util.*;

public class Main {
    static Queue<Coordinate> queue = new LinkedList<>();
    static boolean[][] map;
    static int[][] move = {
            {0, 1}, {0, -1}, {-1, 0}, {1, 0}
    };
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        map = new boolean[n][m];
        List<Integer> area = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            for (int j = startX; j < endX; j++) {
                for (int l = startY; l < endY; l++) {
                    map[j][l] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (Main.map[i][j] == false)  {
                    int count = bfs(i, j, n, m);
                    area.add(count);
                }
            }
        }

        Collections.sort(area);
        for (int i = 0; i < area.size(); i++) {
            sb.append(area.get(i) + " ");
        }

        System.out.println(answer);
        System.out.println(sb);
    }
    public static int bfs(int x, int y, int n, int m) {
        int count = 0;
        map[x][y] = true;
        queue.add(new Coordinate(x, y));

        while (!queue.isEmpty()) {
            count++;
            Coordinate p = queue.poll();
            for (int i = 0; i < move.length; i++) {
                int nextX = p.x + move[i][0];
                int nextY = p.y + move[i][1];
                if (nextX >= 0 && nextX < n && nextY >= 0 && nextY < m) {
                    if (map[nextX][nextY] == false) {
                        map[nextX][nextY] = true;
                        queue.add(new Coordinate(nextX, nextY));
                    }
                }
            }
        }
        answer++;
        return count;
    }
}

class Coordinate {
    int x;
    int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
