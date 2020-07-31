package com.kat.leecode;

import org.w3c.dom.ls.LSException;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找到没有重复字符的最长子串，返回它的长度。
 */
public class LongestSubStr {

    public static int ls(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(j++));
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        int r = ls("abcdefgg");
        System.out.println(r);
    }
}
