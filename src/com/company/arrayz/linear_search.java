package com.company.arrayz;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
    int elements,i,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of elements");
        elements=sc.nextInt();
        System.out.println("Enter the target elements");
        int target=sc.nextInt();
        int arr[] = new int[elements];
        System.out.println("Enter the array elements");
        for (i=0;i<elements;i++) {
            arr[i] = sc.nextInt();
        }
    result=linearsearch(arr,target);
    if(result==-1)
        System.out.println("Target Not found");
    else
        System.out.println("Target Found at index :"+result);
    }
static int linearsearch(int []arr,int target)
{
    if(arr.length ==0)
    {
        return -1;
    }
    for(int i=0;i< arr.length;i++)
    {
        int element = arr[i];
        if(element==target)
        {
            return i;
        }
    }

    return -1;
}

}
