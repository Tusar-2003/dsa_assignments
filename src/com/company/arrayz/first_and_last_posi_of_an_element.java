package com.company.arrayz;
//Find First and Last Position of Element in Sorted Array
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
public class first_and_last_posi_of_an_element {
    public static void main(String[] args) {
    int a[]={5,7,7,8,8,10};
    int target=8;
    int result[]=searchRange(a,target);
    for (int i=0;i< result.length;i++)
    {
        System.out.println(result[i]);
    }

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





