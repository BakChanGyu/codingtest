package org.example.programmers.lv1.u30.p021;

public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int index = length / 2;

        if (length % 2 == 0) {
            answer = String.valueOf(s.charAt(index - 1)) + String.valueOf(s.charAt(index));
        } else {
            answer = String.valueOf(s.charAt(index));
        }

        return answer;
    }
}
