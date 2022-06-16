package com.company.sorting;
//Kth missing positive number
//https://leetcode.com/problems/kth-missing-positive-number/submissions/
//https://www.youtube.com/watch?v=PM0sn2ggtlE&t=6s
/* //Brute Force approach
public int findKthPositive(int[] arr, int k) {
        int idx = 0;
        for(int i: arr){
            idx++;
            if(i-idx>=k)
                return idx+k-1;
        }
        return idx+k;
    }
 */
public class kth_missing_positive_number {
    public static void main(String[] args) {
        int a[]={2,3,4,7,11};
        int result=findKthPositive(a,5);
        System.out.println(result);
    }
    public static int findKthPositive(int[] arr, int k) {
        if(arr[0]>k)return k;
        int start=0;
        int end=arr.length-1;
        int closestMid=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]-(mid+1)<k)
            {
                closestMid=mid+1;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return k+closestMid;
    }
}
