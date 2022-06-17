package com.company.searching;
//Intersection of two array
//Hash Map
//https://www.youtube.com/watch?v=B9L2hjjQCN0
//https://www.youtube.com/watch?v=sCfjXx4q_MM
//https://leetcode.com/problems/intersection-of-two-arrays-ii/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_of_Arrays_II {
    public static void main(String[] args) {
        int a[]={1,2,2,1};
        int b[]={2,2};
        int result[]=intersect(a,b);
        //int result[]=intersect2(a,b);
        System.out.println(Arrays.toString(result));
    }
    //using Hashmap

        public static int[] intersect(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int val:nums1){
                map.put(val,map.getOrDefault(val,0)+1);
            }
            ArrayList<Integer> al=new ArrayList<>();
            for(int val:nums2){
                if(map.containsKey(val)){
                    al.add(val);
                    map.put(val,map.get(val)-1);
                    if(map.get(val)==0) map.remove(val);
                }
            }
            int[] ans=new int[al.size()];
            for(int k=0;k<ans.length;k++){
                ans[k]=al.get(k);
            }
            return ans;
        }
    //using array library function
    public static int[] intersect2(int[] nums1, int[] nums2) {
        int length1=nums1.length;
        int length2=nums2.length;
        int ans[]=new int[length1*length2];
        int i=0,k=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<length1 && j<length2)
        {
            if(nums1[i]<nums2[j])
            {
                i++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else{
                ans[k++]=nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(ans,0,k);
    }
}
