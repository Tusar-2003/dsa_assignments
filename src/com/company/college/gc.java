package com.company.college;

public class gc {
    public static void main(String[] args) {
    gcd(13,60);
    }
    static void gcd(int a,int b)
    {   int max=1;
        for(int i=1;i<=a || i<=b;i++)
        {
                if(a%i==0 && b%i==0)
                {
                    if(i>max)
                    {
                        max=i;
                    }
                }
        }
        System.out.println(max);
    }
}
