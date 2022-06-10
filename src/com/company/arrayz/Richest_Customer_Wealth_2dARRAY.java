package com.company.arrayz;

//https://leetcode.com/problems/richest-customer-wealth/solution/

//class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int maximum=0,sum=0;
//         int []sums=new int[accounts.length];
//         for(int i=0;i<accounts.length;i++)
//         {   sum=0;
//             for(int j=0;j<accounts[i].length;j++)
//             {
//                 sum=sum+accounts[i][j];
//                     sums[i]=sum;
//
//
//                 }
//         }
//         maximum=max(sums);
//         return maximum;
//     }
//     static int max(int []arr)
//     {   int max= Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]>max)
//                 max=arr[i];
//         }
//         return max;
//     }
// }

//more optimized we will use for each loop
/*
class Solution {
    public int maximumWealth(int[][] accounts) {
        // Initialize the maximum wealth seen so far to 0 (the minimum wealth possible)
        int maxWealthSoFar = 0;

        // Iterate over accounts
        for (int[] account : accounts) {
            // For each account, initialize the sum to 0
            int currCustomerWealth = 0;
            // Add the money in each bank
            for (int money : account) {
                currCustomerWealth += money;
            }
            // Update the maximum wealth seen so far if the current wealth is greater
            // If it is less than the current sum
            maxWealthSoFar = Math.max(maxWealthSoFar, currCustomerWealth);
        }

        // Return the maximum wealth
        return maxWealthSoFar;
    }
}
 */

public class Richest_Customer_Wealth_2dARRAY {
    public static void main(String[] args) {
        int res[];int maximum;
        int [][] a={{1,5},{7,3},{3,5}};
        res=sums(a);
        maximum=max(res);
            System.out.println(maximum);


    }
    static int []sums(int [][]accounts)
    {   int []sum=new int[2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                sum[i]=sum[i]+accounts[i][j];
            }
        }
    return sum;
    }
    static int max(int []arr)
    {   int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
