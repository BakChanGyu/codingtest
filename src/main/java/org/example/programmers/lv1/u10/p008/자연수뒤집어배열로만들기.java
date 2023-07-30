package org.example.programmers.lv1.u10.p008;
import java.util.*;

public class 자연수뒤집어배열로만들기 {
    public List<Long> solution(long n) {
        List<Long> answer = new ArrayList<>();

        while (n > 0) {
            answer.add(n % 10);
            n /= 10;
        }

        return answer;
    }
}