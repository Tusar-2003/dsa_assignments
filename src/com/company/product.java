package com.company;

import java.util.Scanner;

public class product {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter Two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        result=products(a,b);
        System.out.println("The product is :" +" "+result);

    }
    static int products(int a,int b){
        int c=a*b;
        return c;
    }
}
