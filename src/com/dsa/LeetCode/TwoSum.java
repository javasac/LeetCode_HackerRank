package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    void TwoSum_1(int[] twosum, int target)
    {
        int arr[] = new int[twosum.length];
        int sum = 0;
        int index = 0;

        for (int i=0; i < twosum.length; i++)
        {
            if ((target > twosum[i]) && (target > sum))
            {
                sum = sum + twosum[i];
                arr[index] = i;
                index++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    // using 2 loops
    void TwoSum_2(int[] twosum, int target)
    {
        for (int i = 0; i < twosum.length; i++)
        {
            for (int j = i + 1; j < twosum.length; j++)
            {
                if (twosum[i] + twosum[j] == target)
                {
                    System.out.println("Index is " + i + " and " + j);
                }
            }
        }
    }

    // solution using Hashmap
    void TwoSum_3(int[] twosum, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int index = 0;

        for (int i=0; i < twosum.length; i++)
        {
            if ((target > twosum[i]) && (target > sum))
            {
                sum = sum + twosum[i];
                map.put(i, twosum[i]);
                index++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();
        int arr[] = {266, 15, 14, 67, 32, 100};
        //ts.TwoSum_1(arr, 29);
        //ts.TwoSum_2(arr, 29);
        ts.TwoSum_3(arr, 29);
    }
}
