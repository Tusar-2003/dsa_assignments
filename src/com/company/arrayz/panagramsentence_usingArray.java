package com.company.arrayz;
//Check if the Sentence Is Pangram
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class panagramsentence_usingArray{
    public static void main(String[] args) {
        boolean result;
        String s="thequickbrownfoxjumpsoverthelazydog";
        result=checkIfPangram(s);
        if(result==true)
            System.out.println("pangram sentence therefore true");
        else
            System.out.println("not pangram therefore false");
    }

        public static boolean checkIfPangram(String sentence) {
            boolean arr[]=new boolean[26];
            for(int i=0;i<sentence.length();i++){
                arr[sentence.charAt(i)-97]=true;
            }
            for(int i=0;i<26;i++)
            {
                if(arr[i]==false)
                    return false;

            }
            return true;
        }

}
