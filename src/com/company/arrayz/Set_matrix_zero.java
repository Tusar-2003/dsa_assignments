package com.company.arrayz;

//set matrix zero
//resource:https://www.youtube.com/watch?v=HliRLQ_A81o
//optimized solution
/*
public void setZeroes(int[][] matrix) {
      int m,n;
        m=matrix.length;
        n=matrix[0].length;
        boolean iscol=false;

        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==0) iscol=true;
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
     for(int i=1;i<m;i++)
        {
            if(matrix[i][0]==0)
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=0;

            }
    }
         for(int i=1;i<n;i++)
        {
            if(matrix[0][i]==0)
            for(int j=0;j<m;j++)
            {
                    matrix[j][i]=0;
            }

}
    if(matrix[0][0]==0)
    { for(int i=0;i<n;i++)
        {
            matrix[0][i]=0;
        }
    }
    if(iscol==true)
    {
        for(int j=0;j<m;j++)
        {
            matrix[j][0]=0;
        }
    }

    }

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Set_matrix_zero {
    public static void main(String[] args) {
        int a[][]={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(a);
    }
    public static void setZeroes(int[][] matrix) {
        List<Integer> row=new ArrayList<>();
        List<Integer>col=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);

                }
            }
        }
        for(int i=0;i<row.size();i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[row.get(i)][j]=0;
            }
        }

        for(int i=0;i<col.size();i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][col.get(i)]=0;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
