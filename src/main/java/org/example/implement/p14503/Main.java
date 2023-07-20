package org.example.implement.p14503;

import java.io.*;
import java.util.*;

public class Main {
    static int answer = 0;
    static int[] moveX = {-1, 0, 1, 0};
    static int[] moveY = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken()); // 0:북 1:동 ---
        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(map, new Point(r, c, d), 1);
        System.out.println(answer);
    }

    public static void dfs(int[][] map, Point cur, int count) {
        map[cur.x][cur.y] = 2; // 청소한 구역

        for (int j = 0; j < 4; j++) {
            cur.direction = (cur.direction + 3) % 4;

            int nextX = cur.x + moveX[cur.direction];
            int nextY = cur.y + moveY[cur.direction];

            if (map[nextX][nextY] == 0) {
                dfs(map, new Point(nextX, nextY, cur.direction), count + 1);
                return;
            }
        }

        // 주변 4칸 청소완료된 경우
        int back = (cur.direction + 2) % 4;
        findNextPoint(map, cur, back, count);
    }

    private static void findNextPoint(int[][] map, Point cur, int back, int count) {
        int nextX = cur.x + moveX[back];
        int nextY = cur.y + moveY[back];

        if (map[nextX][nextY] == 1) {
            answer = count;
            return;
        }
        dfs(map, new Point(nextX, nextY, cur.direction), count);
    }
}

class Point {
    int x;
    int y;
    int direction;

    public Point(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
