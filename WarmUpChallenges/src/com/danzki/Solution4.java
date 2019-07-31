package com.danzki;

import java.io.*;
import java.util.regex.*;

public class Solution4 {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long aCount = getCharCount(s) * (n / s.length()) + getCharCount(s.substring(0, (int) (n % s.length())));
        return aCount;
    }

    private static int getCharCount(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("[^a]*a");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        String s = "aba";
        long n = 10;
        long result = repeatedString(s, n);
        System.out.println("result=" + result);
    }
}