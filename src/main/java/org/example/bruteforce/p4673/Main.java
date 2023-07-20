package org.example.bruteforce.p4673;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] num = new boolean[10000];
        int i = 1;
        while(i < 10000) {
            int n = i;
            int sum = n;
            while (n > 0) {
                int remain = n % 10;
                n /= 10;
                sum += remain;
            }
            if (sum < 10000) {
                num[sum] = true;
            }
            i++;
        }
        for (int j = 1; j < 10000; j++) {
            if (num[j] == false) {
                sb.append(j + "\n");
            }
        }
        System.out.println(sb);
    }
}
