package com.company.searching;

import java.util.Arrays;
import java.util.HashSet;
//intersection of two arrays
//hashset problem
//https://leetcode.com/problems/intersection-of-two-arrays/
//https://www.youtube.com/watch?v=zgLtdM8-6CE
public class intersection_of_two_array {
    public static void main(String[] args) {
        int a[]={1,2,2,1};
        int b[]={2,2};
        int result[]=intersection(a,b);
        System.out.println(Arrays.toString(result));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:nums1){
            set.add(val);
        }
        HashSet<Integer> set2=new HashSet<>();
        for(int val:nums2){
            if(set.contains(val)){
                set2.add(val);
            }
        }
        int[] ans=new int[set2.size()];
        int i=0;
        for(int k:set2){
            ans[i++]=k;
        }
        return ans;
    }
}
