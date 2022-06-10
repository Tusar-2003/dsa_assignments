package com.company.arrayz;
//https://leetcode.com/problems/build-array-from-permutation/
public class Build_array_from_permutation {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        buildArray(arr);
    }

    static void buildArray(int[] nums) {
        int ans;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans = nums[nums[i]];
            result[i] = ans;
            ans = 0;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
