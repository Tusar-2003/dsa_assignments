package com.company.arrayz;

//Spiral Array II
//https://leetcode.com/problems/spiral-matrix-ii/submissions/\
//https://www.youtube.com/watch?v=yeGAAUzAPnU
//resource:   https://www.youtube.com/watch?v=XAuZV1mK_0c

public class spiral_matrix_II {
    public static void main(String[] args) {
        int a=3;
        int result[][]=new int[a][a];
        result=generateMatrix(a);
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

        public static int[][] generateMatrix(int n) {
            int left=0;
            int right=n-1;
            int top=0;
            int bottom=n-1;

            int val=1;
            int ans[][]=new int[n][n];
            while(left<=right && top<=bottom)
            {
                for(int i=left;i<=right;i++)
                {
                    ans[top][i]=val++;
                }
                for(int i=top+1;i<=bottom;i++)
                {
                    ans[i][right]=val++;
                }
                if(top!=bottom)
                {
                    for(int i=right-1;i>=left;i--)
                    {
                        ans[bottom][i]=val++;
                    }
                }
                if(left != right)
                {
                    for(int i=bottom-1;i>top;i--)
                    {
                        ans[i][left]=val++;
                    }
                }
                top++;
                bottom--;
                left++;
                right--;

            }

            return ans;

        }

}
