package com.company.searching;
//Candy swap
//hash set
//https://leetcode.com/problems/fair-candy-swap/
//https://www.youtube.com/watch?v=-gY42yiNLxY
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Candy_swap {
    public static void main(String[] args) {
        int a[]={1,1};
        int b[]={2,2};
        int result[]=fairCandySwap(a,b);
        System.out.println(Arrays.toString(result));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int result[]=new int[2];
        int totalA=0,totalB=0;
        Set<Integer> setB=new HashSet<>();
        for(int a:aliceSizes)
        {
            totalA+=a;
        }
        for(int b:bobSizes)
        {
            totalB+=b;
            setB.add(b);
        }
        int delta=(totalB-totalA)/2;
        for(int a:aliceSizes)
        {
            if(setB.contains(a+delta))
            {
                result[0]=a;
                result[1]=a+delta;
                return result;
            }
        }
        return null;
    }
}
