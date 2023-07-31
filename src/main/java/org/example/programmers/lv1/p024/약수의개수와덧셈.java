package org.example.programmers.lv1.p024;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        int[] memo = new int[right + 1];

        for (int i = left; i <= right; i++) {
            if (getNumberOfDivisors(i, memo) % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public int getNumberOfDivisors(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return memo[n] = count;
    }
}
