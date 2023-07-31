package org.example.programmers.lv1.p025;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        int length = s.length();
        char[] chars = new char[length];

        for (int i = 0; i < length; i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars);

        for (int i = length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return answer = sb.toString();
    }
}
