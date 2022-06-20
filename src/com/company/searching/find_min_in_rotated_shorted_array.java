package com.company.searching;
//Searching minimum number in rotated shorted array
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
//https://www.youtube.com/watch?v=Kcj2NGnuSNg
public class find_min_in_rotated_shorted_array {
    public static void main(String[] args) {
    int a[]={11,13,15,17};
    int ans=findMin(a);
        System.out.println(ans);
    }
    public static int findMin(int[] arr) {
        int start=0,end=arr.length-1;

        if(arr[start]<=arr[end]) return arr[0];
        while(start<=end){
            int mid=start+(end-start)/2;


            if(arr[start]==arr[mid] && arr[end]==arr[mid])
            {
                start++;
                end--;
            }

            if(arr[mid]>arr[mid+1])return arr[mid+1];
            else if(arr[mid]<arr[mid-1])return arr[mid];
            else if(arr[start]<=arr[mid])
            {

                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
}
