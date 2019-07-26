package com.danzki;

public class Solution22 {
    // Complete the rotLeft function below.
    private static int[] rotLeft(int[] a, int d) {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            r[i] = a[i];
        }
        for (int i = 0; i < d; i++) {
            int temp = r[0];
            for (int i1 = 0; i1 < r.length-1; i1++) {
                r[i1] = r[i1+1];
            }
            r[a.length-1] = temp;
        }
        return r;
    }

    public static void main(String[] args) {
        int n = 5;
        int d = 4;
        int[] a = {1, 2, 3, 4, 5};

        int[] result = rotLeft(a, d);
        System.out.println("Сдвиг на " + d);
        System.out.print("Исходный массив:      ");
        arrayPrint(a);
        System.out.println();
        System.out.print("Полученный массив:    ");
        arrayPrint(result);
    }

    private static void arrayPrint(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
