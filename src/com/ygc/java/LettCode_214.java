package com.ygc.java;

/**
 * @Author: yanguochen
 * @Description:
 * @Date: Created in 13:58 2020/8/29
 * @Modified By:最短回文
 */
public class LettCode_214 {
    public static void main(String[] args) {

        LettCode_214 lettCode_214 = new LettCode_214();
        String a = lettCode_214.shortestPalindrome("aacecaaa");
        System.out.println(a);
    }
    /**
     *
     * 直接倒序原本的字符串
     * */
    public String shortestPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        int length = s1.length();
        int i =0;
        for (;i<length;i++){
//            aaacecaa
//            aacecaaa
            String substring = s.substring(0, length - i);
            String substring1 = s1.substring(i);
            if (substring.equals(substring1)){
                break;
            }
        }
        String substring = s.substring(length - i);
        return new StringBuilder(substring).reverse()+s;
    }







}
