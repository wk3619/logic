package com.kat.leecode;

import java.util.HashMap;
import java.util.Map;

public class TowSum {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
       int [] r= towSum(nums,target);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
    public static int[] towSum(int []nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub=target-nums[i];
            if (map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No tow sum solution");
    }
}
