package com.kat.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到没有重复字符的最长子串，返回它的长度。
 */
public class LongestSubStr3 {

    public static int ls(String s) {
        int n = s.length(), ans = 0;
       int [] index=new int [1024];
        for (int i = 0, j = 0; j < n; j++) {
            i=Math.max(index[s.charAt(j)],i);
            ans =Math.max(ans,j-i+1);
            index[s.charAt(j)]=j+1;
        }
        return ans;
    }


    public static void main(String[] args) {
        int r = ls("abcca");
        System.out.println(r);
    }
}
