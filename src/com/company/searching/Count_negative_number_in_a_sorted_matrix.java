package com.company.searching;
//Count Negative Numbers in a Sorted Matrix
//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
//https://www.youtube.com/watch?v=tU3QR5PW8qE
public class Count_negative_number_in_a_sorted_matrix {
    public static void main(String[] args) {
        int a[][] = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        int result = countNegatives(a);
        System.out.println(result);
    }


        public static int countNegatives ( int[][] grid){
            int m = grid.length - 1;
            int n = grid[0].length;
            int pointer = 0;
            int count = 0;
            while (m >= 0 && pointer < n) {
                if (grid[m][pointer] < 0) {
                    m--;
                    count += n - pointer;
                } else {
                    pointer++;
                }

            }
            return count;
        }

}
