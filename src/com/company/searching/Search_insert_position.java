package com.company.searching;
//Search insert position
//https://leetcode.com/problems/search-insert-position/
//https://www.youtube.com/watch?v=0A40XJH_VvE


public class Search_insert_position {
    public static void main(String[] args) {
        int a[]={1,3,5,6};
        int result=searchInsert(a,5);
        System.out.println(result);

    }
    public static int searchInsert(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            {
                end=mid-1;

            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
