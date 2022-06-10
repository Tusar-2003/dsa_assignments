package com.company.arrayz;

//Array should be in ascending order for this to work or descending special case for binary search

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no if elements of the array");
        int length=sc.nextInt();
        int a[]=new int[length];
        System.out.println("Enter an array");
        for(int i=0;i<length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int n=sc.nextInt();
        int result=binarysearch(a,n);
        if(result !=-1) {
            System.out.println("Element found.");
            System.out.println("Position of the elements =" + result);
                        }
        else
        System.out.println("Element not present");

    }
    static int binarysearch(int[] arr,int target)
    {
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
return -1;
    }
}
