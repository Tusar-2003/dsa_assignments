package com.company.searching;

public class single_element_in_a_shorted_matrix {
    public static void main(String[] args) {
        int a[]={1,1,2,3,3,4,4,8,8};
        int result=singleNonDuplicate(a);
        System.out.println(result);
    }
    public static int singleNonDuplicate(int[] nums) {

        int first = 0, last = nums.length-1;
        if(last == 0){
            return nums[0];
        }
        while(first<=last){
            if(nums[first] != nums[first+1]){
                return nums[first];
            }else first = first + 2;
            if(nums[last] != nums[last-1]){
                return nums[last];
            }else last = last - 2;
        }
        return 0;
    }
}
