package com.company.arrayz;
// Create Target Array in the Given Order
//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class Create_Target_Array_in_the_Given_Order {
    public static void main(String[] args) {
    int a[]={0,1,2,3,4};
    int index[]={0,1,2,2,1};
    createTargetArray(a,index);
    }
    static void createTargetArray(int[] nums, int[] index) {
        int target[]=new int[nums.length];
        for(int i=0;i<index.length;i++)
        {
            for(int j=i;j>index[i];j--)
            {
                target[j]=target[j-1];
            }
            target[index[i]]=nums[i];
        }
        for(int i=0;i<index.length;i++)
        {
            System.out.println(target[i]);
        }
    }
}
