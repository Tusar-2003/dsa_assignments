package com.company.sorting;
//Set Mismatch
//https://leetcode.com/problems/set-mismatch/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=2920s
import java.util.Arrays;

public class set_mismatch {
    public static void main(String[] args) {
        int a[]={1,2,2,4};
        int result[]=findErrorNums(a);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i< arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i] != arr[correct])
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
                return new int[] {arr[i],i+1};

        }
        return new int[] {-1,-1};
    }
   static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
