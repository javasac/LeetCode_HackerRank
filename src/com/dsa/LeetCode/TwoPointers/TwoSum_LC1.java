package com.dsa.LeetCode.TwoPointers;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
// Time Complexity = O(n)

class TwoSum_LC1
{
    int[] findSum(int[] sum, int target)
    {
        int diff = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<sum.length; i++)
        {
            diff = target - sum[i];

            if (map.containsKey(diff))
            {
                System.out.println("Numbers are present at " + map.get(diff) + " " + i + ".");
                System.out.println(map);
                return new int[]{map.get(diff), i};
            }
            map.put(sum[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args)
    {
        TwoSum_LC1 ts = new TwoSum_LC1();
        int[] sum = {3, 5, -4, 8, 11, 1, -1, 6};

        int ind[] = ts.findSum(sum, 10);

        Arrays.stream(ind).forEach(System.out::println);
    }
}
