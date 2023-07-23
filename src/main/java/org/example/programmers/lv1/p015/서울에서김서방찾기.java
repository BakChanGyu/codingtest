package org.example.programmers.lv1.p015;

import java.util.Arrays;

public class 서울에서김서방찾기 {

    public String solution(String[] seoul) {
        String answer = "";
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }

        answer = "김서방은 " + index + "에 있다";

        return answer;
    }
}
