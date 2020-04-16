package com.kat.lis;

/**
 * 4,5,7,2,6
 * 4,5
 */
public class Lis_native {
    static int max = 1;

    static int lis_(int arr[], int n) {
        if (n == 1) {
            return 1;
        }
        int res, max_temp = 1;
        for (int i = 1; i < n; i++) {
            res = lis_(arr, i);
            if (arr[i - 1] < arr[n - 1] && max_temp < res + 1) {
                max_temp = res + 1;
            }
        }
        if (max < max_temp) {
            max = max_temp;
        }
        return max_temp;
    }

    public static void main(String[] args) {
//        int arr[] = {10};
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is "
                + lis_(arr, n) + "\n");
    }
}
