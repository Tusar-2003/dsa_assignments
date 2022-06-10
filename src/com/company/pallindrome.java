package com.company;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num = sc.nextInt();
        if (pallin(num) == true)
        {
            System.out.println("Pallindrome Number");

        }
        else
            System.out.println("Not an pallindrome Number");
    }

        static boolean pallin(int a)
        {   int cpy=a;
        int r,s=0;
        while(a!=0)
        {
            r=a%10;
            s=s*10+r;
            a=a/10;
        }
    if(s==cpy)
    return true;
    else
    return false;
}
}