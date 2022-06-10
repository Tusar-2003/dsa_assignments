package com.company.arrayz;
// Add to Array-Form of Integer
//https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.ArrayList;
import java.util.List;
/*  //optimized way without hitting constraints
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
         int n=num.length;
         int i=n-1;
          List<Integer> ans= new ArrayList<>();
     while(i>=0 || k>0)
     {
         if(i>=0)
         {
             ans.add((num[i]+k)%10);
             k=(num[i]+k)/10;
         }
        else
        { ans.add(k%10);
            k/=10;
        }
     i--;
     }
    Collections.reverse(ans);
        return ans;
    }
}
 */
public class Add_to_Array_form_of_integer {
    public static void main(String[] args) {
        int a[] = {1,2,0,0};
        //int result;
        ArrayList<Integer> result= new ArrayList<Integer>();
        //int result[] = new int[a.length];
        result = (ArrayList<Integer>) addToArrayForm(a, 34);
        //System.out.println(result);
        for (int i = result.size()-1; i >= 0; i--) {
            System.out.println(result.get(i));
          }
    }
    public static List<Integer>addToArrayForm(int[] num, int k) {
        int s=0;
          ArrayList<Integer> ans= new ArrayList<Integer>();
       for(int i=0;i<num.length;i++)
        {
            s=10*s+num[i];

        }
        s=s+k;
       int i=0,r=0;
       while(s>0 || i==num.length-1)
    {
        r=s%10;
        ans.add(r);
        i++;
        s=s/10;
            }
       return ans;
    }
}

