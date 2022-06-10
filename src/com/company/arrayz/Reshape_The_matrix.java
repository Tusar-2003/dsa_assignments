package com.company.arrayz;
//resource used: https://www.youtube.com/watch?v=U9TaTtS_y70   ;  https://www.youtube.com/watch?v=JCb27sANkC0
//Reshape the matrix
//https://leetcode.com/problems/reshape-the-matrix/submissions/
public class Reshape_The_matrix {
    public static void main(String[] args) {
        int a[][]={
                {1,2},{3,4}
        };
        int result[][]=matrixReshape(a,1,4);
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
                                            }

        public static int[][] matrixReshape(int[][] mat, int r, int c) {
            if((r*c)!= (mat.length*mat[0].length))
                return mat;
            else if(r==mat.length && c==mat[0].length)
                return mat;
            else{
                int row=0;//row counter
                int col=0;//column counter
                int newArr[][]=new int[r][c];
                for(int i=0;i<mat.length;i++)
                {
                    for(int j=0;j<mat[0].length;j++)
                    {
                        newArr[row][col]=mat[i][j];
                        col++;
                        if(col==c)
                        {
                            row++;
                            col=0;
                        }
                    }

                }
                return newArr;
            }
        }


}
