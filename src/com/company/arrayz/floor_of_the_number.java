package com.company.arrayz;

import java.util.Scanner;

//floor of the number is the greatest element in the array less than or equal to target
//same as binary search just we don't need to return -1 instead we will return end because end will be the possible number which will be the greatest number smaller than or equal to the target
public class floor_of_the_number {
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
        int result=BS(a,n);
        if(result !=-1) {
            //System.out.println("Element found.");
            System.out.println("The floor of the number is =" + result);
        }
        else
            System.out.println("Element not present");
    }
    static int BS(int[] arr,int target){
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
        return arr[end];
    }
}