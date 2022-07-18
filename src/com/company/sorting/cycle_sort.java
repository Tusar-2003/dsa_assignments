package com.company.sorting;
//Cycle Sort
//limitations: Numbers must be in continious state
//https://leetcode.com/problems/missing-number/submissions/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=3s
public class cycle_sort {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4};
        cycle_sort(a);
    }
    public static void cycle_sort(int[] arr) {
        int i=0;
        while(i< arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i] != arr[correct])
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
            System.out.print(arr[i]+" ");
        }

    }
    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
