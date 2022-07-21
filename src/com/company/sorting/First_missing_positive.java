package com.company.sorting;
//First Missing Positive
//https://leetcode.com/problems/first-missing-positive/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=2920s


public class First_missing_positive {
    public static void main(String[] args) {
        int a[]={7,8,9,11,12};
        int result=firstMissingPositive(a);
        System.out.println(result);
    }
    public static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i< arr.length)
        {
            int correct=arr[i]-1;

            if(arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct])
            {
                swap(arr,i,correct);

            }
            else
            {
                i++;
            }
        }

        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
                return i+1;
        }
        return arr.length+1;
    }
    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
