package com.company.arrayz;
//flip an image
//https://leetcode.com/problems/flipping-an-image/
public class flipping_an_image {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] result = new int[3][3];
        result = flip(a);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println("");
        }
    }

    static int[][] flip(int[][] image) {
        int temp=0;
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<(n+1)/2;j++)
            {
                temp=image[i][j]^1;//xor operation gives inverted values
                image[i][j]=image[i][n-j-1]^1;
                image[i][n-j-1]=temp;

            }
        }
        return image;
    }
}

