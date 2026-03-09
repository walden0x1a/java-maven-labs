package com.example;

public class ArrayStats {

    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = a[0];
        for (int x : a) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int min = a[0];
        for (int x : a) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public double mean(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        long sum = 0;
        for (int x : a) {
            sum += x;
        }
        return (double) sum / a.length;
    }
}
