package com.company.sorting;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
//https://www.youtube.com/watch?v=JfinxytTYFQ&t=6s\
//Find All Numbers Disappeared in an Array
//cyclic sort
import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_notpresent {
    public static void main(String[] args) {
        int a[]={4,3,2,7,8,2,3,1};
        List<Integer> ans=new ArrayList<>();
        ans=findDisappearedNumbers(a);
        for (int i=0;i<ans.toArray().length;i++)
        {
            System.out.println(ans.get(i));
        }
    }

        public static List<Integer> findDisappearedNumbers(int[] nums) {
            int i=0;
            while(i<nums.length)
            {
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct])
                {
                    swap(nums,i,correct);
                }
                else
                {
                    i++;
                }
            }

            List<Integer> ans=new ArrayList<>();
            for( i=0;i<nums.length;i++)
            {
                if(nums[i]!= i+1)
                {
                    ans.add(i+1);
                }
            }
            return ans;
        }


        static void swap(int arr[],int first,int second)
        {
            int temp=arr[first];
            arr[first]=arr[second];
            arr[second]=temp;
        }

    }


