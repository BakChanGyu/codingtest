package org.example.baekjoon.p1991;

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer>[] tree = new List[3 * n + 1];

        for (int i = 0; i < tree.length; i++) {
            tree[i] = new LinkedList<>();
        }

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            str = str.replaceAll(" ", "");
            int parent = str.charAt(0) - 64;
            char left = str.charAt(1);
            char right = str.charAt(2);

            if (left != '.') tree[parent].add(left - 64);
            else tree[parent].add(left - 46);
            if (right != '.') tree[parent].add(right - 64);
            else tree[parent].add(right - 46);
        }

        preorder(1, tree, sb);
        sb.append("\n");

        inorder(1, tree, sb);
        sb.append("\n");

        postorder(1, tree, sb);
        sb.append("\n");

        System.out.println(sb);
    }

    public static void preorder(int root, List<Integer>[] tree, StringBuilder sb) {
        sb.append((char) (root + 64));

        for (int i = 0; i < 2; i++) {
            int child = tree[root].get(i);
            if (child != 0) {
                preorder(child, tree, sb);
            }
        }
    }

    public static void inorder(int root, List<Integer>[] tree, StringBuilder sb) {
        for (int i = 0; i < 2; i++) {
            int child = tree[root].get(i);
            if (child != 0) {
                inorder(child, tree, sb);
            }
            if (i == 0) {
                sb.append((char) (root + 64));
            }
        }
    }

    public static void postorder(int root, List<Integer>[] tree, StringBuilder sb) {
        for (int i = 0; i < 2; i++) {
            int child = tree[root].get(i);
            if (child != 0){
                postorder(child, tree, sb);
            }
        }

        sb.append((char) (root + 64));
    }
}
