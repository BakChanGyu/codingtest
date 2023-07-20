package org.example.baekjoon.p1793;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static BigInteger[] memo = new BigInteger[251];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n = 0;
        for (int i = 0; i < 251; i++) {
            memo[i] = new BigInteger("0");
        }
        memo[0] = new BigInteger("1");
        memo[1] = new BigInteger("1");
        memo[2] = new BigInteger("3");

        while (true) {
            str = br.readLine();
            if (str == null) break;

            n = Integer.parseInt(str);
            System.out.println(memoization(n));
        }
    }

    public static BigInteger memoization(int n) {
        if (memo[n].compareTo(new BigInteger("0")) != 0) {
            return memo[n];
        }
        return recursive(n);
    }

    public static BigInteger recursive(int n) {
        return memo[n] = memoization(n - 1).add(memoization(n - 2).multiply(new BigInteger("2")));
    }
}
