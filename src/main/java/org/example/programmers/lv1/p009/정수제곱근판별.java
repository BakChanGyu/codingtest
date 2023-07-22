package org.example.programmers.lv1.p009;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = -1;

        for (int x = 1; x <= n; x++) {
            if (n == Math.pow(x, 2)) {
                return (long) Math.pow(x + 1, 2);
            }

            if (Math.pow(x, 2) > n) {
                return -1;
            }
        }

        return answer;
    }
}
