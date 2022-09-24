package com.company.college;

public class marks extends student{
    int sub1,sub2,sub3;

    marks(String name, String address, int id, int age,int sub1,int sub2,int sub3) {
        super(name, address, id, age);
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }


}
