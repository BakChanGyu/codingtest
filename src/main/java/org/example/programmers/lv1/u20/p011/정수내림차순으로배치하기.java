package org.example.programmers.lv1.u20.p011;

import java.util.*;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;

        List<Long> digit = new ArrayList<>();

        while (n > 0) {
            digit.add(n % 10);
            n /= 10;
        }

        Collections.sort(digit, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digit.size(); i++) {
            sb.append(digit.get(i));
        }

        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
