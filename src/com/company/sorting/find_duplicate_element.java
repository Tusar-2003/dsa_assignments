package com.company.sorting;
//find duplicaye element using cycle sort
//https://leetcode.com/problems/find-the-duplicate-number/submissions/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=2920s
public class find_duplicate_element {
    public static void main(String[] args) {
        int a[]={3,5,2,1,4,4};
        int result=findDuplicate(a);
        System.out.println(result);
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i< arr.length)
        {
            if(arr[i] != i+1){
                int correct=arr[i]-1;
                if(arr[i] != arr[correct])
                {
                    swap(arr,i,correct);
                }
                else
                {
                    return arr[i];
                }

            }

            else
            {
                i++;
            }
        }
        return -1;
    }
    static void swap(int []arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
