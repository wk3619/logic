package com.kat.v1;

/**
 * @author : wangkai16@jd.com
 * create at : 2021/6/2 9:16 下午
 * @description :
 */
public class MergeSort {


    public static void sort(int arr[], int l, int r) {
        if (l == r) {
           return;
        }
        int m = l + (r - l) / 2;
        sort(arr, l, m);
        sort(arr, m + 1, r);

        merge(arr, l, r, m);
    }



    public static void merge(int[] arr, int l, int r, int m) {

        int p1 = l;
        int p2 = m + 1;

        int out[] = new int[r-l+1];
        int i = 0;

        while (p1 <= m && p2 <= r) {
            out[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= m) {
            out[i++] = arr[p1++];
        }

        while (p2 <= r) {
            out[i++] = arr[p2++];
        }

        for (int j = 0; j < out.length; j++) {
            arr[l+j] = out[j];
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 1, 6, 7};
        sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
