package org.example.p2309;

import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] height = new int[9];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }
        brute(height, 9, 7, 0, list,0);
    }
    public static void brute(int[] height, int n, int m, int idx, List<Integer> list, int sum) {
        if (list.size() != 0) {
            sum += list.get(list.size() - 1);
        }
        if (list.size() == m) {
            if (sum == 100) {
                Collections.sort(list);
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
                System.exit(0);
            }
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!list.contains(height[i])) {
                List<Integer> newList = new ArrayList<>(list);
                newList.add(height[i]);

                brute(height, n, m, idx++, newList, sum);
            }
        }
    }
}
