package com.company.arrayz;
//How Many Numbers Are Smaller Than the Current Number
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class Numbers_Smaller_Than_the_Current_Number {
    public static void main(String[] args) {
    int arr[]={8,1,2,2,3};
    smallerNumbersThanCurrent(arr);
    }
    static void smallerNumbersThanCurrent(int[] nums) {
        int []flag=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++)
        {   count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    count++;
            }
            flag[i]=count;
        }
        for (int i=0;i<flag.length;i++)
        {
            System.out.println(flag[i]);
        }
    }
}
