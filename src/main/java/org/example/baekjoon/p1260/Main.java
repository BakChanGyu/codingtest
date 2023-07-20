package org.example.baekjoon.p1260;

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] vertex;
    static Queue<Integer> q;
    static Stack<Integer> stack;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        vertex = new boolean[n + 1][n + 1];
        q = new LinkedList<>();
        stack = new Stack<>();
        boolean[] isVisitedInDfs = new boolean[n + 1];
        boolean[] isVisitedInBfs = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            vertex[a][b] = true;
            vertex[b][a] = true;
        }

        stack.push(v);
        q.add(v);
        isVisitedInDfs[v] = true;
        isVisitedInBfs[v] = true;

        sb = new StringBuilder();
        dfs(vertex, isVisitedInDfs);
        System.out.println(sb);

        sb = new StringBuilder();
        bfs(vertex, isVisitedInBfs);
        System.out.println(sb);
    }

    public static void dfs(boolean[][] vertex, boolean[] isVisited) {
        while (!stack.isEmpty()) {
            int p = stack.pop();
            sb.append(p + " ");

            for (int i = 0; i < vertex.length; i++) {
                if (vertex[p][i] == true && isVisited[i] == false) {
                    stack.push(i);
                    isVisited[i] = true;
                    dfs(vertex, isVisited);
                }
            }
        }
    }

    public static void bfs(boolean[][] vertex, boolean[] isVisited) {
        while (!q.isEmpty()) {
            int p = q.poll();
            sb.append(p + " ");

            for (int i = 0; i < vertex.length; i++) {
                if (vertex[p][i] == true && isVisited[i] == false) {
                    q.add(i);
                    isVisited[i] = true;
                }
            }
        }
    }
}
