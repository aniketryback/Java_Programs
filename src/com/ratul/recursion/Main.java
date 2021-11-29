package com.company;

public class Main {
    public static void main(String[] args)
    {
        int a[]={1,5,2};
        System.out.println(PredictTheWinner(a));
    }
    public static  boolean PredictTheWinner(int[] nums) {
        return helper(nums,0,nums.length-1,1) >=0;
    }
    public static int helper(int nums[],int s,int e , int turn)
    {
        if(s == e)
            return turn * nums[s];
        int a = turn * nums[s] + helper(nums , s + 1, e,-turn);
        int b = turn * nums[e] + helper (nums,s,e-1,-turn);
        return turn * Math.max(turn * a , turn * b);
    }
}
