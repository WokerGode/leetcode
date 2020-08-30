package com.ygc.java;

import java.util.HashSet;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 18:22 2020/8/30
 * @Modified By:
 */
public class LeetCode_3 {
    public static void main(String[] args) {
        LeetCode_3 leetCode_3 = new LeetCode_3();
        int abcabcbb = leetCode_3.lengthOfLongestSubstring1("jbpnbwwd");
        System.out.println(abcabcbb);
    }

    public int lengthOfLongestSubstring(String s) {
//        if (s == null || s.isEmpty()) {
//            return 0;
//        }
        char[] chars = s.toCharArray();
        HashSet<Character> characters = new HashSet<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
            for (int j = i+1; j < chars.length; j++) {
                boolean add = characters.add(chars[j]);
                if (!add) {
                    if (characters.size() > count) {
                        count = characters.size();
                    }
                    characters.clear();
                    break;
                }
            }
        }
        if (characters.size() > count) {
            count = characters.size();
        }
        return count;
    }

    public int lengthOfLongestSubstring1(String s) {
        // 记录字符上一次出现的位置
        int[] last = new int[128];
        for(int i = 0; i < 128; i++) {
            last[i] = -1;
        }
        int n = s.length();

        int res = 0;
        // 窗口开始位置
        int start = 0;
        for(int i = 0; i < n; i++) {
            int index = s.charAt(i);
            start = Math.max(start, last[index] + 1);
            res   = Math.max(res, i - start + 1);
            last[index] = i;
        }

        return res;
    }
}
