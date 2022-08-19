package com.company.college;

public class pseudo {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 0;

        int result = sum(arr, arr.length, sum);
        System.out.println(result);
    }

    static int sum(int arr[], int i, int sum) {
        if (i < 0)
        return sum;
        else
        {
            if(arr[i]%2==1)
           {
               sum += arr[i];
               return sum(arr, i - 1, sum);

           }

        }


       return  sum;

    }
}
