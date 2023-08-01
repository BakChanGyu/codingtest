package org.example.programmers.lv1.u30.p022;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        String answer = "";

        if (n % 2 == 0) {
            answer = "수박".repeat(n / 2);
        } else {
            answer = "수박".repeat(n / 2) + "수";
        }

        return answer;
    }
}
