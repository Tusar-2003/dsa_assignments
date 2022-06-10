package com.company.arrayz;
//Two Sum
//https://leetcode.com/problems/two-sum/submissions/
public class Two_sum {
    public static void main(String[] args) {
        int a[]={3,2,3};
        int target=6;
        int result[];
        result=twoSum(a,target);
        //result=twoSum2(a,target);
        for (int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int l=nums.length;
        int sum=0;
        int arr[]=new int[2];

        for(int i=0;i<l;i++) {
            for (int j = 0; j < l; j++) {
                if (i != j) {
                    sum = nums[i] + nums[j];
                    if (sum == target) {

                            arr[0] = j;


                    }
                    arr[i] = i;
                }
            }
        }
            return arr;

    }
    //2nd method
    public static int[] twoSum2(int[] nums, int target) {
        int l=nums.length;
        int n;
        int ans[]=new int[2];
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++) {
                n = target - nums[i];
                if (nums[j] == n) {
                    ans[0] = i;
                    ans[1] = j;
                }
                n=0;
            }

        }
return ans;
    }
}
