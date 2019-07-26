package com.danzki;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Solution21 {
    private static int getSum(int i, int j, int [][] arr) {
        int sum = 0;
        for (int a = 0; a < 3; a++) {
            sum += arr[i][j+a] + arr[i+2][j+a];
        }
        sum += arr[i+1][j+1];
        return sum;
    }
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        Collection values = new ArrayList();
        int idx = 0;
        for (int i = 0; i < (arr.length - 2); i++) {
            for (int j = 0; j < (arr[0].length - 2); j++) {
                values.add(getSum(i, j, arr));
            }
        }
        return (int) Collections.max(values);
    }

    private static int[][] getInput() {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};
        return arr;
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        arr = getInput();
        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
