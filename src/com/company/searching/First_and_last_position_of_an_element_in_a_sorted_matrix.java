package com.company.searching;
//First and last position of an element in a shorted matrix
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/import java.util.Arrays;

import java.util.Arrays;

public class First_and_last_position_of_an_element_in_a_sorted_matrix {
    public static void main(String[] args) {
    int a[]={5,7,7,8,8,10};
    int []result=searchRange(a,8);
        System.out.println(Arrays.toString(result));
    }
    public static int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int search1= binarysearch(nums,target,true);
        int search2= binarysearch(nums,target,false);
        ans[0]=search1;
        ans[1]=search2;
        return ans;
    }
    static int binarysearch(int[] arr,int target,boolean FindStartIndex)
    {   int ans=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;

            }
            else if(target>arr[mid])
            {
                start=mid+1;
            }
            else {
                ans=mid;
                if(FindStartIndex == true)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
