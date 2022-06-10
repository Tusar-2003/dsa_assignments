package com.company.arrayz;
//Maximum population of the year
//https://leetcode.com/problems/maximum-population-year/
public class max_population_year {
    public static void main(String[] args) {
        int a[][]={
                {1993,1999},
                {2000,2010},
        };
        int result=maximumPopulation(a);
        System.out.println(result);
    }

        public static int maximumPopulation(int[][] logs) {
            int arr[]=new int[101];
            for(int i=0;i<logs.length;i++)
            {
                for(int j=logs[i][0];j<logs[i][1];j++)
                {
                    arr[j-1950]++;
                }
            }
            int maxVal=0;
            int maxYear=1950;
            for(int i=0;i<101;i++)
            {
                if(maxVal<arr[i])
                {
                    maxVal=arr[i];
                    maxYear=i+1950;
                }
            }
            return maxYear;
        }

}
