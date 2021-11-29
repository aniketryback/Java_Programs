package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] a , int left ,int right)
    {
        if(right - left == 1)
            return;
        int mid = (left + right)/ 2;
        sort(a, left, mid);
        sort(a, mid , right);
        merge(a, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right)
    {
        int[] mix = new int[right - left];
        int i = left;
        int j = mid;
        int k = 0;
        while(i < mid && j < right)
        {
            if(arr[i] < arr[j])
            {
                mix[k++] = arr[i];
                i++;
            }
            else
            {
                mix[k++] = arr[j];
                j++;
            }
        }
        while(i < mid)
        {
            mix[k++] = arr[i++];
        }

        while(j < right)
        {
            mix[k++] = arr[j++];
        }

        for(int p = 0; p < mix.length ; p++)
            arr[left + p] = mix[p];

    }

    public static void main(String[] args) {
        int[] a={2,1};
        sort(a,0,a.length );
        System.out.println(Arrays.toString(a));
    }
}
