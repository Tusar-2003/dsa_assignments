package com.company.arrayz;
//Find Numbers with Even Number of Digits
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
    int a[]={12,345,2,6,7896};
    int result=findNumbers(a);
        System.out.println(result);
    }
    public static int findNumbers(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++)
        {
            if(even(nums[i])==true)
                f++;
        }
        return f;
    }
    static boolean even(int n)
    {   int r=0,c=0;
        while(n>0)
        {
            r=n%10;
            c++;
            n=n/10;
        }
        if(c%2==0)
        {
            return true;
        }
        else
            return false;
    }
}
