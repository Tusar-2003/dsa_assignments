package com.company.searching;
//special array with  x elemnet greater than or equal to x
//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class special_array_eith_x_element_greaterthen_or_equal_to_x {
    public static void main(String[] args) {
    int a[]={3,5};
    int result=specialArray(a);
        System.out.println(result);
    }
    public static int specialArray(int[] nums) {
        int left = 0;
        int right = nums.length;
        int answer = -1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            int counter = 0;
            for (int j = 0; j<nums.length; j++) {
                if (nums[j] >= mid) {
                    counter ++;
                }
            }
            if (mid == counter) {
                answer = mid;
                left = mid + 1;
            } else if (mid > counter) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }
}
