package com.company;

import java.util.ArrayList;

public class LetterCombinationsOfPhoneNumber {
    public static ArrayList<String> letterCombinations(String digits) {
        return helper("",digits);
    }
    public static ArrayList<String> helper(String p, String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            if(!p.isEmpty())
                list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();
        if (digit < 7) {
            for (int i = (digit - 2) * 3; i < (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        }
        else if (digit == 7) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        }
        else if (digit == 8)
        {
            for (int i = 19; i < 22; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        }
        else if (digit == 9)
        {
            for (int i = 22; i < 26; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(helper(p + ch, up.substring(1)));
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("8"));
    }
}
