package com.danzki;

public class Solution3 {

    private static int nextStep(int i, int[] c) {
        for (int step=2; step >= 1; step--) {
            if ((i + step) < c.length) {
                if (c[i + step] == 0) {
                    return i + step;
                }
            }
        }
        return i;
    }
    // Complete the jumpingOnClouds function below.
    private static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i = 0;
        while (i < c.length) {
            int step = nextStep(i, c);
            if (step != i) {
                jumps++;
                i = step;
            } else {
                i++;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        int[] c = new int[]{0, 0, 0, 0, 1, 0};
        int result = jumpingOnClouds(c);
        System.out.println("c=" + c + ": result=" + result);
    }
}