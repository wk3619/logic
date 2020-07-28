package com.kat.lis;

public class Lis2 {
    public static int llis(int []nums){
        return llis(nums,Integer.MIN_VALUE,0);
    }

    /**
     *
     * @param nums
     * @param pre
     * @param cur 当前比较元素
     * @return
     */
    public  static int llis(int [] nums,int pre,int cur){
        if (cur==nums.length){
            return 0;
        }
        int taken=0;
        if (nums[cur]>pre){
            taken=1+llis(nums,nums[cur],cur+1);
        }
        int not=llis(nums,pre,cur+1);
        return Math.max(taken,not);
    }

    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;
        System.out.println("Length of lis is "
                + llis(arr) + "\n");
    }
}
