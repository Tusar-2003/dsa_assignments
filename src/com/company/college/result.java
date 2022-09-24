package com.company.college;

public class result extends marks{
    int avg;char grade;

    result(String name, String address, int id, int age, int sub1, int sub2, int sub3) {
        super(name, address, id, age, sub1, sub2, sub3);
    }

    int average()
    {
        avg=(sub1+sub2+sub3)/3;
        return avg;
    }
    char Grades()
    {
        if(avg > 70)
            grade='A';
        else if (avg > 50 && avg <=69) {
            grade='B';

        }
        else
        {
            grade='C';
        }
    return grade;
    }

    void print_result()
    {
        System.out.println("AVERAGE = " + this.average());
        System.out.println("GRADE = "  + this.Grades());
    }
}
