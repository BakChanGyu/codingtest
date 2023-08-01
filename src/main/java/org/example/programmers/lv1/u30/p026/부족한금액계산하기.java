package org.example.programmers.lv1.u30.p026;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (sum > money) {
            answer = sum - money;
        }

        return answer;
    }
}
