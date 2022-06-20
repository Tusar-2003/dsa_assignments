package com.company.searching;
//Searching in rotated shorted array II
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
//https://www.youtube.com/watch?v=WkihvY2rJjc
public class Searching_in_rotated_array_II {
    public static void main(String[] args) {
        int a[]={2,5,6,0,0,1,2};
        int target=0;
        boolean ans=search(a,target);
        System.out.println(ans);
    }
    public static boolean search(int[] nums, int target) {
        int ans;
        ans=Bsearch(nums,target);
        if(ans != -1)
            return true;
        else
            return false;
    }
    public static int Bsearch(int[] arr, int target) {
        // if(arr.length==1)return arr[0];

        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)return mid;
            if(arr[start]==arr[mid] && arr[end]==arr[mid])
            {
                start++;
                end--;
            }

            else if(arr[start]<=arr[mid])
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
                if(target>=arr[mid] && target<=arr[end])
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
