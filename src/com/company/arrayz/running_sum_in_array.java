package com.company.arrayz;
//https://leetcode.com/problems/running-sum-of-1d-array/

//optimized way to solve the above problem
/*class Solution {
    public int[] runningSum(int[] nums) {
        int sumTillNow = 0;
        for(int i=0; i<nums.length; i++){
            nums[i] = nums[i] + sumTillNow;
            sumTillNow = nums[i];
        }
        return nums;
    }
}
*/
public class running_sum_in_array {
    public static void main(String[] args) {
    int []arr={1,2,3,4};
    int[] res=runningsum(arr);
        for(int i=0;i< res.length;i++)
        {
            System.out.println(res[i]);
        }

    }
    static int []runningsum(int []nums)
    {   int[] result=new int[nums.length];
        int sum=0;
        for(int i=0;i< nums.length;i++) {
            if (i == 0) {
                result[0] = nums[0];
            } else {
                sum = sums(nums, 0, i);
                result[i] = sum;
                sum = 0;
            }
        }
    return result;
    }

    static int sums(int []arr,int start,int end)
    {   int sum=0;
    for(int i=start;i<=end;i++){
        sum=sum+arr[i];
    }
    return sum;
    }
}

