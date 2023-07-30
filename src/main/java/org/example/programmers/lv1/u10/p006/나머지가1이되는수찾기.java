package org.example.programmers.lv1.u10.p006;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 0;
        int x = n - 1;

        while (x > 0) {
            if (n % x == 1) {
                answer = x;
            }

            x--;
        }

        return answer;
    }
}
