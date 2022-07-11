package com.company.arrayz;
//NExt permutation
//https://leetcode.com/problems/next-permutation/
//https://www.youtube.com/watch?v=LuLCLgMElus&list=PLgUwDviBIf0rPG3Ictpu74YWBQ1CaBkm2&index=9
import java.util.Arrays;

public class next_permutation {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        int result[] = nextPermutation(a);
        System.out.println(Arrays.toString(result));
    }
    public static int[] nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1)
            return nums;
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])
            i--;
        if(i>=0)
        {
            int j=nums.length-1;
            while(nums[j]<=nums[i])
                j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
        return nums;
    }

    static void  swap(int []a,int i,int j)
    {
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    static void  reverse(int []a,int i,int j)
    {
        while(i<j)
            swap(a,i++,j--);
    }
}

