package com.company.arrayz;
//Determine whether matrix can be obtained by rotation or not
//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/submissions/
public class Determine_whether_matrix_can_be_obtained_by_rotation_or_not {
    public static void main(String[] args) {
        int a[][]={{0,0,0},{0,1,0},{1,1,1}};
        int target[][]={{1,1,1},{0,1,0},{0,0,0}};
        boolean result=findRotation(a,target);
        System.out.println(result);
}
        static void rotate(int [][]matrix)
        {
            int n=matrix.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    int temp= matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }

            }
            int start=0;
            int end=matrix.length-1;
            while(start<=end)
            {
                for(int row=0;row<matrix.length;row++)
                {
                    int temp=matrix[row][start];
                    matrix[row][start]=matrix[row][end];
                    matrix[row][end]=temp;
                }
                start ++;
                end--;
            }
        }
        static boolean check(int [][]matrix,int[][] target)
        {
            for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix.length;j++)
                {
                    if(matrix[i][j]!=target[i][j])
                    {
                        return false;
                    }
                }
            }
            return true;
        }
        public static boolean findRotation(int[][] mat, int[][] target) {
            for(int i=0;i<4;i++)
            {
                if(check(mat,target))
                {
                    return true;
                }
                rotate(mat);
            }
            return false;

        }

}
