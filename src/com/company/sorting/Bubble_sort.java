package com.company.sorting;
//Bubble sort
//https://www.youtube.com/watch?v=F5MZyqRp_IM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=18&t=1s

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int a[]={5,6,3,2,1};
        int result[]=sortArray(a);
        System.out.println(Arrays.toString(result));
    }

        public static int[] sortArray(int[] nums) {
            boolean swapped=false;
            for(int i=0;i<nums.length;i++)
            {   swapped=false;
                for(int j=1;j<nums.length-i;j++)
                {
                    if(nums[j]<nums[j-1])
                    {
                        int temp=nums[j];
                        nums[j]=nums[j-1];
                        nums[j-1]=temp;
                        swapped=true;
                    }
                }
                if(!swapped)
                {
                    break;
                }
            }
            return nums;
        }

}

