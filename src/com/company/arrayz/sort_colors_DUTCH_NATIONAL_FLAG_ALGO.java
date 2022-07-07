package com.company.arrayz;
//Sort Colors
//DUTCH NATIONAL FLAG ALGORITHM
//https://leetcode.com/problems/sort-colors/
//https://www.youtube.com/watch?v=oaVa-9wmpns
import java.util.Arrays;

public class sort_colors_DUTCH_NATIONAL_FLAG_ALGO {
    public static void main(String[] args) {
        int a[]={0,1,1,0,0,1,1,0,2};
        sortColors(a);

    }
    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<= high)
        {
            if(nums[mid]==0)
            {
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
