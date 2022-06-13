package com.company.arrayz;
//Jump Game
//https://leetcode.com/problems/jump-game/
//https://www.youtube.com/watch?v=C6AZyfj-Kyw
public class Jump_game {
    public static void main(String[] args) {
        boolean ans;
        int a[]={2,3,1,1,4};
        ans=canJump(a);
        System.out.println(ans);
    }
    public static boolean canJump(int[] nums) {
        int max=0;
        if(nums.length==1) return true;

        for(int i=0;i<nums.length && max>=i ;i++)
        {
            if(max<i+nums[i])
            {
                max=i+nums[i];
            }
            if(max >= nums.length-1)
            {
                return true;
            }

        }
        return false;
    }
}
