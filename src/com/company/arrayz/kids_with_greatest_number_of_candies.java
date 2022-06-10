package com.company.arrayz;
//Kids With the Greatest Number of Candies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
/*  optimized way
class Solution {
   static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> bool = new ArrayList<Boolean>(4);
        int max_value = candies[0];

        for(int i = 0; i < candies.length; i++){
            max_value = Math.max(max_value, candies[i]);
            candies[i] = candies[i] + extraCandies;
        }
        for(int j = 0; j < candies.length ; j ++){
            if(candies[j] < max_value){
                bool.add(false);
            }
            else{
                bool.add(true);
            }
        }
        return bool;
    }
}
 */
public class kids_with_greatest_number_of_candies {
    public static void main(String[] args) {
    int max=Integer.MAX_VALUE;
        int candies[]={4,2,1,1,2};
    boolean array[]= new boolean[candies.length];
    array=candies(candies,1);
        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }

    }
    public static boolean[] candies(int[] candies, int extraCandies) {
        boolean []a=new boolean[candies.length];
        int sum;
        for(int i=0;i< candies.length;i++)
        {
            sum=candies[i]+extraCandies;
            a[i]=max(candies,sum);
            sum=0;
        }
        return a;
    }
    static boolean max(int[]arr,int max)
    {
        int m=max;int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=max)
            {
                f++;
            }

        }
        if(f==arr.length)
            return true;
        else
            return false;
    }
}

