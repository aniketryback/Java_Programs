package com.company;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int []arr,int left, int right)
    {
        if(left >= right)
            return;
        int s = left;
        int e = right;
        int mid = s + (e - s) / 2;
        int pivot = arr[mid];

        while(s <= e)
        {
            while(arr[s] < pivot)
                s++;
            while(arr[e] > pivot)
                e--;
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }

        }
        sort(arr,left, e);
        sort(arr,s ,right);

    }

    public static void main(String[] args) {
        int a[] = {6,8,0,3,8,1};
        sort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }

}
