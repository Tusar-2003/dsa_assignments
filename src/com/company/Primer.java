package com.company;

import java.util.Scanner;

public class Primer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter a number :");
        num= sc.nextInt();
        if(prime(num)==true)
        {
            System.out.println("prime number");
        }
        else
            System.out.println("Not prime number");
    }
    static boolean prime(int a)
    {   int c=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                c++;
        }
    if(c==2)
        return true;
    else
        return false;
    }
}
