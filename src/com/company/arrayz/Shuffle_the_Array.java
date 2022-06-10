package com.company.arrayz;
// Shuffle the Array
//https://leetcode.com/problems/shuffle-the-array/
/*
optimized

class Solution {
    public int[] shuffle(int[] nums, int n) {

        for(int i=0;i<n;i++)
        {
           nums[i+n]+=nums[i]*10000;
        }
        for(int i=0;i<n;i++)
        {
            nums[2*i]=nums[i+n]/10000;
            nums[2*i+1]=nums[i+n]%10000;
        }
        return nums;
    }
}

 */
public class Shuffle_the_Array {
    public static void main(String[] args) {

        int []nums ={2,5,1,3,4,7};
        shuffle(nums,3);


    }
    static void shuffle(int[] nums, int n) {
        int ans[]=new int[2*n];
        int j=0;
        for(int i=0;i<2*n;i+=2)
        {
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
        }
        for(int i=0;i<2*n;i++)
        {
            System.out.println(ans[i]);
        }

    }
}
