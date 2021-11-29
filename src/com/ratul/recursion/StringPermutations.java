package com.company;

import java.util.ArrayList;

public class StringPermutations {
    public static void main(String[] args) {
        String a = "ab";
        System.out.println(Permutations("",a));
    }
    public static ArrayList<String> Permutations(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i <= p.length();i++)
        {
            String s = p.substring(0,i);
            String e = p.substring (i,p.length());
            ans.addAll(Permutations(s+ch+e,up.substring(1)));
        }
        return ans;
    }
}
