package org.example.programmers.lv1.u20.p012;

public class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int digit = x;

        while (digit > 0) {
            sum += digit % 10;
            digit /= 10;
        }

        if (x % sum == 0) {
            answer = true;
        }

        return answer;
    }
}
