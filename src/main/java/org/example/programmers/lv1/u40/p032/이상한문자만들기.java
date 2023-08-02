package org.example.programmers.lv1.u40.p032;

public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    int start = 0;
                    int index = start + i;

                    while (index < s.length() && s.charAt(index) != ' ') {
                        if (start % 2 == 0) {
                            sb.append((char) (s.charAt(index) - 32));
                        } else {
                            sb.append(s.charAt(index));
                        }

                        start++;
                        index++;
                    }

                    i = index - 1;
                }
            } else {
                sb.append(" ");
            }
        }

        return answer = sb.toString();
    }public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                if (i == 0 || s.charAt(i - 1) == ' ') {
                    int start = 0;
                    int index = start + i;

                    while (index < s.length() && s.charAt(index) != ' ') {
                        if (start % 2 == 0) {
                            sb.append((char) (s.charAt(index) - 32));
                        } else {
                            sb.append(s.charAt(index));
                        }

                        start++;
                        index++;
                    }

                    i = index - 1;
                }
            } else {
                sb.append(" ");
            }
        }

        return answer = sb.toString();
    }
}
