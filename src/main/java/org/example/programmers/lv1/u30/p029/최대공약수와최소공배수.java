package org.example.programmers.lv1.u30.p029;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = getGCD(n, m);
        answer[1] = getLCM(n, m);

        return answer;
    }

    public int getGCD(int n, int m) {
        if (n == 0) {
            return m;
        }

        return getGCD(m % n, n);
    }

    public int getLCM(int n, int m) {
        int gcd = getGCD(n, m);

        return gcd * (n / gcd) * (m / gcd);
    }
}
