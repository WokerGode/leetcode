package com.ygc.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_17 {
    private char i[][]={
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}
    };
    private ArrayList res;
    public List<String> letterCombinations(String digits) {
        res =new ArrayList();
        if (digits.isEmpty()){
            return res;
        }
        findCombation(digits,"",0);
        return res;
    }
    private void findCombation(String digits,String s,int index){
        if (index  == digits.length()){
            res.add(s);
            return;
        }
        char c = digits.charAt(index);
        char[] chars = i[c - '0'];
        for (int j = 0; j < chars.length ; j++) {
            findCombation(digits,s+chars[j],index+1);
        }
    }

    public static void main(String[] args) {
        Leetcode_17 leetcode_17 = new Leetcode_17();
        List<String> strings = leetcode_17.letterCombinations1("23");
        System.out.println(strings);
    }

    private static Map<Integer, String> map = new HashMap<Integer, String>() {
        {
            put(2, "abc");
            put(3, "def");
            put(4, "ghi");
            put(5, "jkl");
            put(6, "mno");
            put(7, "pqrs");
            put(8, "tuv");
            put(9, "wxyz");
        }
    };

    public List<String> letterCombinations1(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        dfs(new StringBuilder(), digits, 0, res);
        return res;
    }

    public void dfs(StringBuilder sb, String digits, int n, List<String> res) {
        if (n == digits.length()) {
            res.add(sb.toString());
            return;
        }
        int c = Integer.parseInt(String.valueOf(digits.charAt(n)));
        String s = map.get(c);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dfs(sb, digits, n + 1, res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

}
