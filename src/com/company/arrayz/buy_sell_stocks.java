package com.company.arrayz;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//Best Time to Buy and Sell Stock
//https://youtu.be/eMSfBgbiEjk
public class buy_sell_stocks {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int result=maxProfit(a);
        System.out.println(result);
    }
    public static int maxProfit(int[] arr) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            maxPro = Math.max(maxPro, arr[i] - minPrice);
        }
        return maxPro;
    }
}
