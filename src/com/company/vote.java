package com.company;

import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Enter your age :");
        age= sc.nextInt();
        if(voter(age)==true)
            System.out.println("Can Vote");
        else
            System.out.println("Cannot Vote");
    }
    static boolean voter(int a){
        if(a>=18)
            return true;
        else
            return false;
    }
}
