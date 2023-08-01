package org.example.programmers.lv1.u30.p030;

public class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }

        for (int i = 0; i < sb.length(); i++) {
            int index = sb.length() - i - 1;
            answer += ((int) sb.charAt(index) - 48) * (int) Math.pow(3, i);
        }

        return answer;
    }
}
