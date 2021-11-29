package com.ratul.strings;

import java.util.ArrayList;
import java.util.List;

public class CheckPermutationsinString {
        public static boolean checkInclusion(String s1, String s2) {
                List<String> check = Permutations("",s1);
                for(String example : check)
                {

                        if(s2.contains(example))
                                return true;
                }
                return false;
         }

        public static ArrayList<String> Permutations(String p, String up)
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

        public static void main(String[] args) {
                System.out.println(checkInclusion("ab","eidbaooo"));
        }
}
