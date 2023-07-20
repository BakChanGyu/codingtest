package org.example.baekjoon.p1331;

import java.io.*;
import java.util.*;

public class p1331 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] board = new boolean[7][7];
        String answer = "Valid";
        int firstCol = 0;
        int firstRow = 0;
        int lastCol = 0;
        int lastRow = 0;
        int prevCol = 0;
        int prevRow = 0;

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                String str = br.readLine();
                int col = str.charAt(0) - 64;
                int row = str.charAt(1) - 48;

                if (prevCol != 0 && prevRow != 0) {
                    int subCol = Math.abs(col - prevCol);
                    int subRow = Math.abs(row - prevRow);

                    if ((subCol == 1 && subRow == 2) || (subCol == 2 && subRow == 1)) {

                    }
                    else {
                        answer = "Invalid";
                        break;
                    }
                }
                board[col][row] = true;
                prevCol = col;
                prevRow = row;

                if (i == 1 && j == 1) {
                    firstCol = col;
                    firstRow = row;
                }
                if (i == 6 && j == 6) {
                    lastCol = col;
                    lastRow = row;
                }
            }
        }

        int resultCol = Math.abs(firstCol - lastCol);
        int resultRow = Math.abs(firstRow - lastRow);
        if ((resultCol == 1 && resultRow == 2) || (resultCol == 2 && resultRow == 1)) {

        } else {
            answer = "Invalid";
        }

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (board[i][j] == false) {
                    answer = "Invalid";
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}
