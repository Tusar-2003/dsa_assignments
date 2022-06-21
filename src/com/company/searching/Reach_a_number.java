package com.company.searching;
// Reach a Number
//https://www.youtube.com/watch?v=F23zJlz__SM
//https://leetcode.com/problems/reach-a-number/
public class Reach_a_number {
    public static void main(String[] args) {
    int a=2;
    int ans=reachNumber(a);
        System.out.println(ans);
    }
    public static int reachNumber(int target) {
        target = Math.abs(target);
        int k = 0;
        while (target > 0)
            target -= ++k;
        return target % 2 == 0 ? k : k + 1 + k%2;
    }
}
