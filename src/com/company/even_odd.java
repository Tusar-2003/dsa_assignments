package com.company;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num,result;
        System.out.println("Enter a number");
        num=in.nextInt();
        if(even(num)==true)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
    static boolean even(int a)
    {
        if(a%2==0)
            return true;
        else
            return false;
    }
}
