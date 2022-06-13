package com.company.arrayz;
//Rotate matrix
//https://leetcode.com/problems/rotate-array/submissions/
//https://www.youtube.com/watch?v=gmu0RA5_zxs
//https://www.youtube.com/watch?v=ENcnXXiRT6E
import java.util.Arrays;

public class Rotate_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    static void reverse(int nums[],int start,int end){
        while(start<end)
        {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }
}
