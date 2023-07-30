package org.example.programmers.lv1.u20.p016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어떨어지는숫자배열 {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }

        Collections.sort(answer);

        if (answer.size() == 0) {
            answer.add(-1);
        }

        return answer;
    }
}
