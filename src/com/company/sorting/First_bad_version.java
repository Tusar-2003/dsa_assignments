package com.company.sorting;
//first version control
//https://www.youtube.com/watch?v=4n783kDY5n4
//https://leetcode.com/problems/first-bad-version/submissions/

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

   /* public class Solution extends VersionControl {
        public int firstBadVersion(int n) {

            int start=1,end=n,ans=-1;
            while(start<=end)
            { int mid=start+(end-start)/2;
                if(isBadVersion(mid)==false)
                {
                    start=mid+1;
                }else{
                    ans=mid;
                    end=mid-1;
                }
            }
            return ans;
        }
    }
*/


