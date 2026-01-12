package com.dsa.LeetCode;
import java.util.*;

public class MajorityElement_LC_169
{
    // find using HashMap
    int majorityNumber(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap();

        for (int i=0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Integer max = Collections.max(map.values());
        int major = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println("Key " + entry.getKey() + " and Value = " + entry.getValue());
            if (max == entry.getValue())
            {
                major = entry.getKey();
            }
        }

        return major;
    }

    // smart Technique
    int findMajority(int arr[])
    {
        Arrays.sort(arr);

        return arr[arr.length / 2];
    }

    // Find MashMap using Streams
    int majorElement(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Optional<Map.Entry<Integer, Integer>> m = map.entrySet().stream().max(Map.Entry.comparingByValue());
        int maxVal = m.get().getKey();

        return maxVal;
    }

    public static void main(String[] args)
    {
        MajorityElement_LC_169 me = new MajorityElement_LC_169();
        int[] arr = {9, 8, 8, 6, 8, 9};
        //int[] arr = {2, 2, 1, 3, 1, 2, 2};

        System.out.println("Majority Element is " + me.majorityNumber(arr));
        System.out.println("Majority Element is " + me.findMajority(arr));
        System.out.println("Majority Element is " + me.majorElement(arr));

    }
}
