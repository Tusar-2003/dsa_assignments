package com.company.oops;

public class employee {
    String name;
    int id;
    int salary;

    void set_details(String n,int i,int sal )
    {
        name=n;
        id=i;
        salary=sal;

    }
    void sal(int e)
    {
        if(e>5000)
        {
            e=e+3000;
        }
        else {
            e=e+1000;
        }
    }
    void display()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Id : "+id);
        System.out.println("Salary : "+salary);
    }

    public static void main(String[] args) {
        employee e1 =new employee();
        employee e2 =new employee();
        employee e3 =new employee();
        employee e4 =new employee();
        employee e5 =new employee();

        e1.set_details("Aa",01,7000);
        e1.sal(e1.salary);
        e1.display();

        e2.set_details("Aae",02,2000);
        e2.display();
        e3.set_details("Aad",03,2000);
        e3.display();
        e4.set_details("Aac",04,1000);
        e4.display();
        e5.set_details("Aab",05,1000);
        e5.display();
    }
}
