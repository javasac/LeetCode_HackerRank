package com.dsa.LeetCode;
import java.util.HashMap;
import java.util.Map;

// optimum solution to Two Sum without sorting
public class TwoSumAgain
{
    void findSum(int target, int[] sum)
    {
        int diff = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<sum.length; i++)
        {
            diff = target - sum[i];
            map.put(sum[i], i);

            if (map.containsKey(diff))
            {
                System.out.println("Numbers are present at " + map.get(diff) + " " + i + ".");
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] sum = {23, 5, 7, 12, 15};
        TwoSumAgain ts = new TwoSumAgain();
        ts.findSum(30, sum);
    }
}
