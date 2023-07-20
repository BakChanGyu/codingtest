package org.example.programmers.lv1.p007;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCount++;
            } else if (s.charAt(i) == 'y') {
                yCount++;
            }
        }

        if (pCount != yCount) {
            answer = false;
        }

        return answer;
    }
}
