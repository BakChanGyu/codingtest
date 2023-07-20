package org.example.graph.p2667;

import java.util.*;
import java.io.*;

public class Main {
    static int[][] map;
    static boolean[][] isVisited;
    static int[][] move = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        map = new int[n + 2][n + 2];
        isVisited = new boolean[n + 2][n + 2];
        int count = 0;
        List<Integer> size = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 1; j <= n; j++) {
                map[i][j] = str.charAt(j - 1) - 48;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] == 1 && isVisited[i][j] == false) {
                    int sum = bfs(i, j);
                    size.add(sum);
                    count++;
                }
            }
        }

        Collections.sort(size);

        answer.append(count + "\n");
        for (int i = 0; i < size.size(); i++) {
            answer.append(size.get(i) + "\n");
        }
        System.out.println(answer);
    }

    public static int bfs(int row, int col) {
        int sum = 1;
        isVisited[row][col] = true;
        queue.add(new int[]{row, col});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int pRow = poll[0];
            int pCol = poll[1];

            for (int j = 0; j < move.length; j++) {
                int x = pRow + move[j][0];
                int y = pCol + move[j][1];
                if (map[x][y] == 1 && isVisited[x][y] == false) {
                    isVisited[x][y] = true;
                    sum++;
                    queue.add(new int[]{x, y});
                }
            }
        }

        return sum;
    }
}
