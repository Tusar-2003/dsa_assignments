package com.company.arrayz;
//Number of Good Pairs
//https://leetcode.com/problems/number-of-good-pairs/
public class Identical_array_pairs {
    public static void main(String[] args) {
        int a[]={1,2,3,1,1,3};
        int res=0;
        res=numIdenticalPairs(a);
        System.out.println(res);
    }

    public static int numIdenticalPairs(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++)

        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    res++;
            }
        }
        return res;
    }
}