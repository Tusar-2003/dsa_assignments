package com.company.sorting;
//Two Sum II - Input Array Is Sorted
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
//https://www.youtube.com/watch?v=sAQT4ZrUfWo
/*
class Solution {
    public int[] twoSum(int[] num, int target) {
        int start=0,end=num.length-1;

        while(start<=end){

            if(target==num[start]+num[end])
            {
                return new int[]{start+1,end+1};

            }
            else if(target < num[start]+num[end])
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return new int[]{start+1,end+1};
    }
}
 */

