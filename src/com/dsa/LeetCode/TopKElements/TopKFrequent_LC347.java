// nums = [1,1,1,2,2,3], k = 2
// [1,2]
package com.dsa.LeetCode.TopKElements;
import java.util.*;

public class TopKFrequent_LC347
{
    void topKElements(int[] arr, int k)
    {
        Map<Integer, Integer> tm = new TreeMap<>();
        int ctr = 0;

        for (int i : arr)
        {
            tm.put(i, tm.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : tm.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + " and Value = " + entry.getValue());
        }

        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(tm.entrySet());
        entries.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        Map<Integer, Integer> sortedByValueDesc = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : entries)
        {
            sortedByValueDesc.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : sortedByValueDesc.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + " and Value = " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        TopKFrequent_LC347 top = new TopKFrequent_LC347();

        int[] nums = {10, 90, 20, 20, 30, 30, 30, 40, 30, 90, 90};
        int k = 3;

        top.topKElements(nums, k);
    }
}
