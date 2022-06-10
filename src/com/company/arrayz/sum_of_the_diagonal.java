package com.company.arrayz;
//Matrix Diagonal Sum
//Given a square matrix mat, return the sum of the matrix diagonals.
//
//Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
//
// https://leetcode.com/problems/matrix-diagonal-sum/
public class sum_of_the_diagonal {
    public static void main(String[] args) {
        int a[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int res = diagonalSum(a);
        System.out.println(res);
    }

        public static int diagonalSum(int[][] mat) {
            int sum=0;
            for(int i=0;i<mat.length;i++)
            {
                sum+=(mat[i][i]+mat[i][mat.length-i-1]);
            }
            if(mat.length%2==0)
            {
                return sum;
            }
            else
                return sum=sum-mat[mat.length/2][mat.length/2];
        }

}
