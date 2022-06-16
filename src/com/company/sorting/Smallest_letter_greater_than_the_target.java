package com.company.sorting;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/submissions/
//Find Smallest Letter Greater Than Target
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=15
public class Smallest_letter_greater_than_the_target {
    public static void main(String[] args) {
        char[] a ={'c','f','j'};
        char result=nextGreatestLetter(a,'a');
        System.out.println(result);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid])
            {
                end=mid-1;

            }
            else {
                start=mid+1;
            }

        }
        return letters[start%letters.length];
    }
}

