package com.company.searching;

import java.util.HashSet;
import java.util.Set;
//Check If N and Its Double Exist
//Hash Set
//https://www.youtube.com/watch?v=wbwHsgoEsxA
//https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class check_if_n_and_its_double_exist {
    public static void main(String[] args) {
        int a[]={10,2,5,3};
        boolean result=checkIfExist(a);
        System.out.println(result);
    }
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i], b = 2 * a;
            if (set.contains(b) || (a % 2 == 0 && set.contains(a / 2))) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}
