package com.company;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans= sum2();
        System.out.println("Answer="+ans);
    }
    static int sum2()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int num1=in.nextInt();
        System.out.println("Enter a number 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }
    static void sum(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number 1:");
        int num1=in.nextInt();
        System.out.println("Enter a number 2:");
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("The sum="+sum);
    }
}
