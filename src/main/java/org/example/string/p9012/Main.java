package org.example.string.p9012;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            int count = 0;
            int answer = 0;

            // ( 나올때 스택에 넣고 ) 나올때 빼기
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    count++;
                } else {
                    count--;
                }
                if (count < 0) {
                    answer = -1;
                    break;
                }
            }
            if (answer == -1 || count != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
