package org.example.programmers.lv1.u10.p005;


public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        int i = 10;

        while (n > 0) {
            answer += n % i;
            n /= i;
        }

        return answer;
    }
}
