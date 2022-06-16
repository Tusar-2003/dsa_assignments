package com.company.searching;
//find peak element in a zig zag array
//https://leetcode.com/problems/find-peak-element/
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=3732s
//same as mountain array
public class find_peak_element {
    public static void main(String[] args) {
        int a[]={1,2,3,1};
        int result=findPeakElement(a);
        System.out.println(result);
    }
    public static int findPeakElement(int[] arr) {
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
