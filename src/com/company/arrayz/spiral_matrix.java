package com.company.arrayz;

import java.util.ArrayList;
import java.util.List;

//Spiral Matrix
//https://leetcode.com/problems/spiral-matrix/
//resource:   https://www.youtube.com/watch?v=XAuZV1mK_0c
public class spiral_matrix {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        int a[][]={
                {1,2,3},{4,5,6},{7,8,9}
        };
        ans=spiralOrder(a);
        for (int i=0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        while (m * n > ans.size()) {
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            if (top != bottom) {
                for (int i = right - 1; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
            }
            if (left != right) {
                for (int i = bottom - 1; i > top; i--) {
                    ans.add(matrix[i][left]);
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
