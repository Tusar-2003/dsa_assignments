package com.company.arrayz;
// Minimum Cost to Move Chips to The Same Position
//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
//we will use for each loop or enhanced for loop only over here
//resource used:https://www.youtube.com/watch?v=FPgC3RfHMBI
public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public static void main(String[] args) {
int a[]={1,2,3};
int result=minCostToMoveChips(a);
        System.out.println(result);
    }
    public static int minCostToMoveChips(int[] position) {
        int even=0;
        int odd=0;
        for(int i:position)
        {
            if(i%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        return Math.min(even,odd);
    }
}
