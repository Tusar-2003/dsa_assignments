package com.company.sorting;
//Sqrt(x)
//https://leetcode.com/problems/sqrtx/discuss/2152101/Java-or-Binary-Search-Solution
//https://leetcode.com/problems/sqrtx/
public class sqrt_x_ {
    public static void main(String[] args) {
        int x=4;
        int result=mySqrt(x);
        System.out.println(result);

    }
    public static int mySqrt(int x) {
        if(x<=1)return x;
        int start=0,end=Integer.MAX_VALUE;
        int ans=0;
        int target=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target/mid==mid)
            {
                return mid;


            }
            else if(mid<target/mid)
            {
                ans=mid;
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}
