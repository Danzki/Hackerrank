package com.danzki;

import java.util.Scanner;

public class Solution2 {

    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {
        int result = 0;
        int level = 0;
        for (int i = 0; i < n; i++) {
            String step = s.substring(i, i + 1).toUpperCase();
            switch (step) {
                case "U":
                    level++;
                    break;
                case "D":
                    if (level == 0)
                        result ++;
                    level--;
                    break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 8;
        String s = "UDDDUDUU";// "1";
        int result = countingValleys(n, s);
        System.out.println("n=" + n + "; s=" + s + ": result=" + result);

        n = 10;
        s = "UDUUUDUDDD";// "0";
        result = countingValleys(n, s);
        System.out.println("n=" + n + "; s=" + s + ": result=" + result);

        n = 10;
        s = "DDUDDUUDUU";// "1";
        result = countingValleys(n, s);
        System.out.println("n=" + n + "; s=" + s + ": result=" + result);
    }
}

