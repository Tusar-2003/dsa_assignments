package com.company.arrayz;
//Lucky Numbers in a Matrix
//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix {
    public static void main(String[] args) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        int a[][]={
                {3,7,8},{9,11,13},{15,16,17}
        };
        ans= (ArrayList<Integer>) luckyNumbers(a);
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }

    }
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans= new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++)
        {int minIndex=0;
            int min=99999999;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isTrue=true;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[i][minIndex] < matrix[j][minIndex])
                {
                    isTrue=false;
                    break;
                }
            }
            if(isTrue==true)
            {
                ans.add(matrix[i][minIndex]);
            }
        }
        return ans;
    }
}
