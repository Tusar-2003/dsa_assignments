package com.company.searching;
//Valid Perfect Square
//https://leetcode.com/problems/valid-perfect-square/
//https://www.youtube.com/watch?v=Dym8_DkOWL4
public class Valid_perfect_sq {
    public static void main(String[] args) {
        int a=16;
        boolean result=isPerfectSquare(a);
        System.out.println(result);
    }
    public static boolean isPerfectSquare(int num) {
        int start=0,end=num;
        if(num==1)
            return true;

        while(start<=end){

            long mid=start+(end-start)/2;
            long sq=mid*mid;
            if(num==sq)
            {
                return true;

            }
            else if(num>sq)
            {
                start=(int)mid+1;
            }
            else{
                end=(int)mid-1;
            }
        }
        return false;
    }

}
