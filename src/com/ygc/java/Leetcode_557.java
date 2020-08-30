package com.ygc.java;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 17:34 2020/8/30
 * @Modified By:
 */
public class Leetcode_557 {


    public String reverseWords(String s) {
        String[] s1 = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            stringBuilder.append(new StringBuilder(s1[i]).reverse());
            if (i != s1.length-1){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();

    }
}
