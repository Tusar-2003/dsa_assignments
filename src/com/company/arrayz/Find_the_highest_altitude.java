package com.company.arrayz;
//Find_the_highest_altitude
//https://leetcode.com/problems/find-the-highest-altitude/
public class Find_the_highest_altitude {
    public static void main(String[] args) {
        int []gain={-5,1,5,0,-7};
        int result=0;
        result=largestAltitude(gain);
        System.out.println(result);

    }
    public static int largestAltitude(int[] gain) {
        int max=0,current=0;

        for(int i=0;i<gain.length;i++)
        {
            current=current+gain[i];
            max=Math.max(current,max);
        }
        return max;
    }
}
