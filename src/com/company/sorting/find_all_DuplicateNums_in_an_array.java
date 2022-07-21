package com.company.sorting;
// Find All Duplicates in an Array
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=2920s
import java.util.ArrayList;
import java.util.List;

public class find_all_DuplicateNums_in_an_array {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4,2,3};
        findDuplicates(a);
    }
    public static void findDuplicates(int[] arr) {
        List<Integer> ans=new ArrayList<>();
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
                ans.add(arr[i]);
        }
        for(i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));

        }
    }
    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
