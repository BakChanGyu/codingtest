package org.example.p1744;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int minusCount = 0;
        int answer = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] < 0) {
                minusCount++;
            }
        }

        if (n == 1) {
            System.out.println(arr[0]);
            System.exit(0);
        }

        Arrays.sort(arr);
        // 음수는 음수끼리 묶는다.
        // 음수가 짝수개면 다 묶고, 홀수개면 하나 남기거나 0이랑 묶는다.
        if (minusCount % 2 == 0) {
            for (int i = 1; i < minusCount; i += 2) {
                answer += arr[i] * arr[i - 1];
            }
            // 양수 처리
            if (minusCount < n && arr[minusCount] == 0) {
                minusCount++;
            }
            // 양수가 짝수개인 경우
            if ((n - minusCount) % 2 == 0) {
                for (int i = n - 1; i >= minusCount; i -= 2) {
                    answer += Math.max(arr[i] * arr[i - 1], arr[i] + arr[i - 1]);
                }
            }
            // 양수가 홀수개인 경우
            else {
                for (int i = n - 1; i >= minusCount + 1; i -= 2) {
                    answer += Math.max(arr[i] * arr[i - 1], arr[i] + arr[i - 1]);
                }
                answer += arr[minusCount];
            }
        }
        // 음수가 홀수개
        else {
            for (int i = 1; i < minusCount; i += 2) {
                answer += arr[i] * arr[i - 1];
            }
            // arr[minusCount - 1] == 마지막 음수
            if (minusCount < n && arr[minusCount] == 0) {
                answer += arr[minusCount] * arr[minusCount - 1];
                minusCount++;
            } else {
                answer += arr[minusCount - 1];
            }

            // 남은 양수가 짝수개
            if ((n - minusCount) % 2 == 0) {
                for (int i = n - 1; i >= minusCount ; i -= 2) {
                    answer += Math.max(arr[i] * arr[i - 1], arr[i] + arr[i - 1]);
                }
            }
            // 홀수개
            else {
                for (int i = n - 1; i >= minusCount + 1 ; i -= 2) {
                    answer += Math.max(arr[i] * arr[i - 1], arr[i] + arr[i - 1]);
                }
                answer += arr[minusCount];
            }
        }

        System.out.println(answer);
    }
}
