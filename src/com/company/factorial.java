package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        int result = factorials(num);
        System.out.println(result);
    }

    static int factorials(int a) {
        int fact = 1;
        for (int i=1;i<=a;i++)
        {
            fact=fact*i;
        }


        return fact;
    }
}
