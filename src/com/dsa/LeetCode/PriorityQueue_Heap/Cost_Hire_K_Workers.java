package com.dsa.LeetCode.PriorityQueue_Heap;

import java.util.Arrays;

public class Cost_Hire_K_Workers
{
    public long totalCost(int[] costs, int k, int candidates)
    {
        long total = 0l;

        Arrays.sort(costs);

        for (int i = 0; i < k; i++)
        {
            total = total + costs[i];
        }

        return total;
    }

    public static void main(String[] args)
    {
        Cost_Hire_K_Workers ch = new Cost_Hire_K_Workers();

        //int[] costs = {17,12,10,2,7,2,11,20,8};
        int[] costs = {1,2,4,1};
        int k = 3;
        int candidates = 3;

        System.out.println("Total Cost is " + ch.totalCost(costs, k, candidates));
    }
}
