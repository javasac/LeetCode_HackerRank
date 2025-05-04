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
            if (tm.containsKey(i))
            {
                ctr = tm.get(i);
                tm.replace(i, ctr + 1);
            }
            else
            {
                tm.put(i, 1);
            }
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

        System.out.println("===========Sorted==================");
        for (Map.Entry<Integer, Integer> entry : sortedByValueDesc.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + " and Value = " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        TopKFrequent_LC347 top = new TopKFrequent_LC347();

        int[] nums = {1, 9, 2, 2, 3, 3, 3, 4, 3, 9, 9};
        int k = 2;

        top.topKElements(nums, k);
    }
}
