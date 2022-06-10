package com.company.arrayz;
// cells with odd values in the matrix
//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
public class cells_with_odd_values_in_matrix {
    public static void main(String[] args) {
        int indices[][]={{0,1},{1,1}};
        int result=oddCells(2,3,indices);
        System.out.println(result);
    }

        public static int oddCells(int m, int n, int[][] indices) {
            int ans[][]=new int[m][n];
            int c=0;
            for(int i=0;i<indices.length;i++)
            {   //row is constant
                for(int j=0;j<n;j++)
                {
                    ans[indices[i][0]][j]++;
                }
                //column is constant
                for(int j=0;j<m;j++)
                {
                    ans[j][indices[i][1]]++;
                }

            }
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(ans[i][j]%2!=0)
                        c++;
                }
            }
            return c;
        }
    }

