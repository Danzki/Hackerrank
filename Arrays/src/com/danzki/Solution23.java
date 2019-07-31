package com.danzki;

import java.util.ArrayList;
import java.util.List;

public class Solution23 {
    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int swaps = 0;
        for (int i = 0; i < q.length; i++) {
            if ((q[i] - (i+1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for (int j = i + 1; j < q.length; j++) {
                if (q[i] > q[j]) {
                    int t = q[j];
                    q[j] = q[i];
                    q[i] = t;
                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    }

    public static void main(String[] args) {
        int t = 2;
        int n = 5;
        int[] q = new int[n];

        for (int tItr = 0; tItr < t; tItr++) {
            fillQueue(t, q);
            minimumBribes(q);
        }
    }

    private static void fillQueue(int t, int[] q) {
        q[0] = 2;
        q[1] = t == 0 ? 1 : 5;
        q[2] = t == 0 ? 5 : 1;
        q[3] = 3;
        q[4] = 4;
    }
}
