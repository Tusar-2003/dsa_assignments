package com.company.arrayz;
//Remove Duplicates from Sorted Array
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
//req resource:https://www.youtube.com/watch?v=Fm_p9lJ4Z_8
/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.
 */

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
    int a[]={1,1,2};
    int result=removeDuplicates(a);
        System.out.println(result);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int i=0;


        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}
