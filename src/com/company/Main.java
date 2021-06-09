package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] arr = {1.2, 2.5, -2.3, 4.3, -5.5, 4.4, -4.2, 4.1, -2.2, 3.3, 3.1, -3.7, 8.8, 8.1, -8.5};
        double sum = 0.0;
        int kolichestvo = 0;
        boolean isPositive = false;

        for (double d : arr) {
            if (d < 0) {
                isPositive = true;
            } else if (isPositive) {
                sum = sum + d;
                kolichestvo++;
            }
        }
        double result = sum / kolichestvo;
        System.out.println("result;" + result);


        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i - 1]) {
                    double temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                isSorted = false;
                }
            }
            System.out.println(Arrays.toString(arr));

        }
    }
}