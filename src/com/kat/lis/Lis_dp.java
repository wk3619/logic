package com.kat.lis;

public class Lis_dp {
    static int lis(int arr[],int n){
        int l[]=new int[n];
        for (int i : l) {
            l[i]=1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j]&&l[i]<l[j]+1){
                    l[i]=l[j]+1;
                    for (int i1 : l) {
                        System.out.print(i1);
                    }
                }
            }
        }
        int max=0;
        for (int i : l) {
            max=Math.max(i,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is "
                + lis(arr, n) + "\n");
    }
}
