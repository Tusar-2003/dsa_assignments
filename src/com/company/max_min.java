package com.company;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a,b,c,min,max;
        System.out.println("Enter A:");
        a=in.nextInt();
        System.out.println("Enter B:");
        b= in.nextInt();
        System.out.println("Enter C:");
        c= in.nextInt();
        min=Min(a,b,c);
        max=Max(a,b,c);
        System.out.println("The maximum Number="+max);
        System.out.println("The minimum number="+min);

    }
    static int Max(int a,int b,int c)
    {
        if(a>b && a>c)
        {
            return a;
        }
        else if(b>a && b>c)
        {
            return b;
        }
        else
            return c;
    }
    static int Min(int a,int b,int c)
    {
        if(a<b && a<c)
        {
            return a;
        }
        else if(b<a && b<c)
        {
            return b;
        }
        else
            return c;
    }
}
