package com.company.arrayz;
//plus one
//https://www.youtube.com/watch?v=G737jzcxG9A
//https://leetcode.com/problems/plus-one/submissions/
import java.util.Arrays;

public class Plus_one {
    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        int result[] = plusOne(a);
        //int result=plusone(a);
        //System.out.println(result);
        System.out.println(Arrays.toString(result));
    }

        public static int[] plusOne ( int[] digits){
            int n = digits.length;
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int newDigit[] = new int[n + 1];
            newDigit[0] = 1;
            return newDigit;
        }


}
