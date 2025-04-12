package com.dsa.LeetCode.HashMap_Set;

import java.util.HashMap;
import java.util.Map;

public class K_Pairs_Diff_532
{
    int findPairs(int[] nums, int k)
    {
        int ctr = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int n : nums)
        {
            map.putIfAbsent(n, 1);
        }

        for (Integer v : map.keySet())
        {
            sum = v + k;
            System.out.println(v);

            if (map.containsKey(sum))
            {
                ctr++;
            }
        }

        return ctr;
    }

    public static void main(String[] args)
    {
        K_Pairs_Diff_532 kp = new K_Pairs_Diff_532();
        int[] nums = {3, 1, 4, 1, 5, 2, 7};
        int k = 2;

        System.out.println("K Diff Pairs are " + kp.findPairs(nums, k));
    }
}
