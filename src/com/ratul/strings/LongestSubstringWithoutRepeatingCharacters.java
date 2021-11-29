package com.ratul.strings;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {

        public static int lengthOfLongestSubstring(String s) {
            ArrayList<Character> list = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < s.length(); i++)
            {
                char ch = s.charAt(i);
                if(!list.contains(ch)) {
                    list.add(ch);
                    continue;
                }
                if(max < list.size()) {
                    max = list.size();
                    list.clear();
                    list.add(ch);
                }
            }
            if(max < list.size())
                max = list.size();

            return max;
        }

        public static void main(String[] args)
        {
            System.out.println(lengthOfLongestSubstring("dvdf"));
        }
}
