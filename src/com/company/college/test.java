package com.company.college;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of students :");
        int n = sc.nextInt();
        String name, address;
        int id,age, sub1, sub2, sub3;

        for (int i = 1; i <= n; i++) {
            System.out.println("Student : "+ i);
            System.out.println("Enter the name of the student : ");
            name= sc.next();
            System.out.println("Enter adddress :");
            address= sc.next();
            System.out.println("Enter ID : ");
            id= sc.nextInt();
            System.out.println("Enter age");
            age= sc.nextInt();
            System.out.println("Enter marks of 3 subjects :");
            sub1= sc.nextInt();
            sub2= sc.nextInt();
            sub3= sc.nextInt();
            result ob = new result(name,address,id,age,sub1,sub2,sub3);
            ob.print_result();
            System.out.println("--------------------------------------------------------------------------------------");
        }
    }
}