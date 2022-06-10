package com.company.arrayz;
// Maximum Subarray
//https://leetcode.com/problems/maximum-subarray/
//Kaden's algorithm
public class Maximum_subarray_KADENS_ALGO {
    public static void main(String[] args) {
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxSubArray(a);
        System.out.println(result);
    }
    public static int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>max)
                max=sum;
            if(sum<0)
                sum=0;
        }
        return max;
    }
}

