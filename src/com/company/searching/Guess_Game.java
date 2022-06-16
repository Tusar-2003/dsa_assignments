package com.company.searching;
//https://leetcode.com/problems/guess-number-higher-or-lower/submissions/
//Guess Game

/*
public class Guess_Game {
    public static void main(String[] args) {

    }
    /**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
/*
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start=0,end=n;
            int nums=0;
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                nums=guess( mid);
                if(nums==0)
                {
                    return mid;

                }
                else if(nums==-1)
                {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            return -1;
        }
    }

}

 */
