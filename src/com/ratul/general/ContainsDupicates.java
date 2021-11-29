package com.ratul.general;

import java.util.ArrayList;
import java.util.List;

public class ContainsDupicates {

        public static boolean containsDuplicate(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0 ; i < nums.length; i++)
            {
                if(!list.contains(nums[i]))
                    list.add(nums[i]);
                else
                    return true;
            }
            return false;
        }

    public static void main(String[] args) {
            int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    }

