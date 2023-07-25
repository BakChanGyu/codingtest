package org.example.programmers.lv1.p018;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String sub = phone_number.substring(length - 4, length);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }

        String answer = sb.toString() + sub;

        return answer;
    }
}
