package com.company;


import java.util.ArrayList;

public class NumberOfDiceRollsWithTargetSum {
    public static ArrayList<String> numRollsToTarget(int target)
    {
        return helper("" , target);
    }
    public static ArrayList<String> helper(String p , int target)
    {
        if(target == 0)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1;i <= 6 && i <= target; i++)
        {
             ans.addAll(helper(p + i, target - i));
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numRollsToTarget(7));
    }
}
