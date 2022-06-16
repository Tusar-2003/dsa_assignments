package com.company.sorting;
//Peak Index in mountain array
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=3732s
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peak_index_in_mountain_array {
    public static void main(String[] args) {
        int a[]={0,1,0};
        int result=peakIndexInMountainArray(a);
        System.out.println(result);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                end=mid;

            }
            else {
                start=mid+1;
            }
        }
        return start;
    }
}
