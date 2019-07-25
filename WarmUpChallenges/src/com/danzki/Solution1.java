package com.danzki;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {

    // Complete the sockMerchant function below.
    private static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> socks = new HashMap<>();
        for (int i=0; i < n; i++) {
            Integer key = ar[i];
            int value;
            if (socks.get(key) == null) {
                value = 1;
            } else {
                value = socks.get(key) + 1;
            }
            socks.put(key, value);
        }

        int result = 0;
        for(Map.Entry<Integer, Integer> sock : socks.entrySet()) {
            result = result + sock.getValue() / 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = sockMerchant(n, ar);
        System.out.println("result = " + result);
    }
}

