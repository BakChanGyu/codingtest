package org.example.programmers.lv1.p020;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        int[] answer = new int[arr.length - 1];
        int j = 0;

        while (j < index) {
            answer[j] = arr[j];
            j++;
        }

        j = index + 1;
        while (j < arr.length) {
            answer[j - 1] = arr[j];
            j++;
        }

        return answer;
    }
}
