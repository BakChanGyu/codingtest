package org.example.baekjoon.p9095;

import java.io.*;
import java.util.*;

public class Main {
    static int[] memo = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 1) {
                memo[n] = 1;
            }
            else if (n == 2) {
                memo[n] = 2;
            }
            else if (n == 3) {
                memo[n] = 4;
            }
            else {
                for (int j = 3; j >= 1; j--) {
                    int remain = n - j;
                    memo[n] += memoization(remain);
                }
            }

            System.out.println(memo[n]);
        }
    }
    public static int memoization(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        return recursive(n);
    }
    public static int recursive(int n) {
        if (n == 1) {
            memo[n] = 1;
            return 1;
        }
        if (n == 2) {
            memo[n] = 2;
            return 2;
        }
        if (n == 3) {
            memo[n] = 4;
            return 4;
        }
        return recursive(n - 1) + recursive(n - 2) + recursive(n - 3);
    }
}
