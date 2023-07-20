package org.example.baekjoon.p10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();
        int[] arr = new int[10];

        int sum = 0;
        // 10의 배수
        if (n.contains("0")) {
            // 각 자리수의 합이 3의 배수.
            for (int i = 0; i < n.length(); i++) {
                sum += Integer.parseInt(String.valueOf(n.charAt(i)));
            }
            if (sum % 3 == 0) {
                for (int i = 0; i < n.length(); i++) {
                    arr[Integer.parseInt(String.valueOf(n.charAt(i)))]++;
                }
                for (int i = 9; i >= 0; i--) {
                    while (arr[i] > 0) {
                        System.out.print(i);
                        arr[i]--;
                    }
                }
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }
    }
}
