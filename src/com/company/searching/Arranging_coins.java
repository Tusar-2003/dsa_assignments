package com.company.searching;
//Arrange Coins
//https://www.youtube.com/watch?v=QnNFgzyKDhE
//https://leetcode.com/problems/arranging-coins/solution/
//formula== mid*(mid+1)/2   for N number of numbers
public class Arranging_coins {
    public static void main(String[] args) {

    }
    //unoptimized solution
    public static int arrangeCoins(int n) {
        int i = 1;
        while (n>0) {
            n-=i;
            i++;
        }
        if (n<0) i--;
        return i-1;
    }
    //optimized solution
    public static int arrangeCoins2(int n) {
        long start=0,end=n;
        while(start<=end){
            long mid=start+(end-start)/2;
            if(mid*(mid+1)/2==n)
            { return (int)mid;
            }
            else if(mid*(mid+1)/2<n){
                start=mid+1;

            }
            else {
                end=mid-1;
            }
        }
        return (int)end;
    }
}
