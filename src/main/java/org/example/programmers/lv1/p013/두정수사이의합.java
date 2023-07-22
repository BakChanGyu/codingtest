package org.example.programmers.lv1.p013;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int last = Math.max(a, b);

        for (int i = start; i <= last; i++) {
            answer += i;
        }

        return answer;
    }
}
