package com.company.searching;
//search in rotated array
//https://leetcode.com/problems/search-in-rotated-sorted-array/
//https://www.youtube.com/watch?v=r3pMQ8-Ad5s
public class search_in_rotated_array {
    public static void main(String[] args) {
        int a[]={4,5,6,7,0,1,2};
        int target=0;
        int result=search(a,target);
        System.out.println(result);
    }
    public static int search(int[] arr, int target) {
        // if(arr.length==1)return arr[0];

        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;

            if(arr[start]<=arr[mid])
            {
                if(target>=arr[start] && target<=arr[mid])
                {
                    end=mid-1;
                }
                else
                    start=mid+1;

            }

            else
            {
                if(target>=arr[mid]&& target<=arr[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }

        }
        return -1;
    }
}
