package com.example;

public class ArrayStats {

    public int max(int[] a) {
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public int min(int[] a) {
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public double mean(int[] a) {
        long sum = 0;
        for (int x : a) {
            sum += x;
        }
        return (double) sum / a.length;
    }
}
