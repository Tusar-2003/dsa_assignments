package com.company.arrayz;
//House Robbers using recursion
//https://leetcode.com/problems/house-robber/
//https://www.youtube.com/watch?v=GrMBfJNk_NY&t=547s
public class House_robbers_DYNAMIC_PROGRAMMING {
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        int result=rob(a);
        System.out.println(result);
    }
    public static int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            dp[i]=-1;
        }
        return f(n-1,nums,dp);

    }

    static int f(int index,int []nums,int []dp)
    {
        if(index==0)return nums[0];
        if(index<0)return 0;
        if(dp[index] != -1 )return dp[index];

        int pick=nums[index]+f(index-2,nums,dp);
        int notpick=0+f(index-1,nums,dp);

        return dp[index]=Math.max(pick,notpick);
    }
}
