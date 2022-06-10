package com.company.arrayz;
//Find N Unique Integers Sum up to Zero
//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {

        int n=6;
        int result[];
        result=sumZero(n);


            System.out.println(Arrays.toString(result));

    }

    public static int[] sumZero(int n) {
        int ans[]=new int[n];
        if(n%2==0)
        {
            for(int i=0;i<n-1;i+=2)
            {
                ans[i+1]=i+1;
                ans[i]=-(i+1);
            }
        }
        else
        {
            for(int i=0;i<n-1;i+=2)
            {
                ans[i+1]=i+1;
                ans[i]=-(i+1);
            }
            ans[n-1]=0;
        }

        return ans;
    }
}

