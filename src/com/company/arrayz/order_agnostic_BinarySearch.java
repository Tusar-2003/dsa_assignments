package com.company.arrayz;
//this is when we don't know what is the order of the given array (either ascending or descending)
import java.util.Scanner;

public class order_agnostic_BinarySearch {
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
        int result=OrderAgnosticBS(a,n);
        if(result !=-1) {
            System.out.println("Element found.");
            System.out.println("Position of the elements =" + result);
        }
        else
            System.out.println("Element not present");
    }
    static int OrderAgnosticBS(int []arr,int target){
        int start=0,end=arr.length-1;

        //check whether the array is ascending or descending
        boolean isAsc;
        if(arr[start]<arr[end]) {
            isAsc = true;
        }
        else {
            isAsc = false;
        }

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
        if(isAsc==true) {
            if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

            else {
            if (target > arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
            }
        }
        return -1;
    }

    }


