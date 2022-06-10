package com.company.arrayz;

import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        concatinate(arr);
    }
    static void concatinate(int []nums)
    {int ans[]=new int[nums.length*2];
     for(int i=0;i<nums.length;i++)
     {
         ans[i]=nums[i];
         ans[i+nums.length]=nums[i];
     }
        System.out.println(Arrays.toString(ans));
    }

}

