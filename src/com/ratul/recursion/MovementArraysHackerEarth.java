package com.company;
import java.util.Scanner;
public class MovementArraysHackerEarth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Test Cases:");
        int t = sc.nextInt();
        while (t>0)
        {
           int n = sc.nextInt();
           int []arr = new int[n];
           for (int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
           int count = sc.nextInt();
           boolean flag = true;
           for(int i = 0;i < arr.length;i++)
           {
              count+=count;
              if(count >= arr.length)
              {
                  flag=false;
                  break;
              }
           }
           System.out.println(flag);
           t--;
        }
    }

}
