package com.company.arrayz;
//product of array except self
//https://leetcode.com/problems/product-of-array-except-self/submissions/
//https://www.youtube.com/watch?v=hi-6HyIk_BM
/* optimized sol. // without division
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []ans=new int[n];
        int curr=1;
        for(int i=0;i<n;i++)
        {
            ans[i]=curr;
            curr=curr*nums[i];
        }
        curr=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i]*=curr;
            curr=curr*nums[i];
        }
return ans;
    }
}

 */
public class Product_of_array_except_self {
    public static void main(String[] args) {
    int a[]={1,2,3,4};
    int result[]=new int[a.length];
    result=productExceptSelf(a);
    for(int i=0;i<result.length;i++)
    {
        System.out.println(result[i]);
    }
    }

        public static int[] productExceptSelf(int[] nums) {

            int p=1;int flag=0;


            for(int i=0; i<nums.length; i++)
            {
                if(nums[i]==0)
                {
                    flag++;
                }
                else
                {
                    p=p*nums[i];
                }
            }

            if(flag==0)
            {

                for(int i=0;i<nums.length;i++)
                {

                    nums[i]=p/nums[i];
                }
            }
            else if(flag==1)
            {
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]==0)
                    {
                        nums[i]=p;
                    }
                    else
                    {
                        nums[i]=0;
                    }
                }
            }
            else
            {
                for(int i=0;i<nums.length;i++)
                {


                    nums[i]=0;
                }

            }
            return nums;
        }


}
