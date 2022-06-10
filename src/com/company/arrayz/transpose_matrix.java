package com.company.arrayz;
//Transpose matrix
//https://leetcode.com/problems/transpose-matrix/
public class transpose_matrix {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        // int a[][]={{1,2,3},{4,5,6}};
        int [][] result=new int[a.length][a.length];
        result=transpose(a);
        for(int i=0;i<result.length;i++)
        {
            for(int j=0;j< result.length;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

        public static int[][] transpose(int[][] matrix) {
            int [][] result=new int[matrix[0].length][matrix.length];
            for(int i=0;i<matrix[0].length;i++)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    result[i][j]=matrix[j][i];
                }
            }
            return result;
        }

}
