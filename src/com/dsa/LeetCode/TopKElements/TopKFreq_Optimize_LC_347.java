// Top K Frequent Elements.
package com.dsa.LeetCode.TopKElements;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class TopKFreq_Optimize_LC_347
{
    int[] topKFreq(int[] nums, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] buck = new ArrayList[nums.length + 1];

        for (int n : nums)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet())
        {
            System.out.println(m.getKey() + " = " + m.getValue());
        }

        int freq = 0;
        for (int key : map.keySet())
        {
            freq = map.get(key);

            if (buck[freq] == null)
            {
                buck[freq] = new ArrayList<>();
            }
            buck[freq].add(key);
        }

        int[] res = new int[k];
        int ctr = 0;

        for (int pos = buck.length-1; pos >= 0 && ctr < k; pos--)
        {
            if (buck[pos] != null)
            {
                for (Integer in : buck[pos])
                {
                    res[ctr++] = in;
                }
            }
        }

        System.out.println();
        for (int n : res)
        {
            System.out.print(n + ", ");
        }

        return res;
    }

    public static void main(String[] args)
    {
        TopKFreq_Optimize_LC_347 to = new TopKFreq_Optimize_LC_347();

        int num[] = {10, 10, 20, 30, 40, 30, 10, 40};
        to.topKFreq(num, 3);
    }
}
