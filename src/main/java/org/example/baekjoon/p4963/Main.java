package org.example.baekjoon.p4963;

import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] isVisited;
    static int[][] move = {
            {0, -1}, {-1, -1}, {-1, 0}, {-1, 1},
            {0, 1}, {1, 1}, {1, 0}, {1, -1}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;
            int answer = 0;
            map = new int[h + 2][w + 2];
            isVisited = new boolean[h + 1][w + 1];

            for (int i = 1; i <= h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= w; j++) {
                    int land = Integer.parseInt(st.nextToken());
                    if (land == 1) {
                        map[i][j] = land;
                    }
                }
            }
            for (int i = 1; i <= h; i++) {
                for (int j = 1; j <= w; j++) {
                    if (map[i][j] == 1 && isVisited[i][j] == false) {
                        dfs(i, j, w);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void dfs(int row, int col, int w) {
        isVisited[row][col] = true;

        for (int i = 0; i < move.length; i++) {
            int nextRow = row + move[i][0];
            int nextCol = col + move[i][1];
            if (map[row + move[i][0]][col + move[i][1]] == 1) {
                if (isVisited[nextRow][nextCol] == false) {
                    dfs(nextRow, nextCol, w);
                }
            }
        }
    }
}
