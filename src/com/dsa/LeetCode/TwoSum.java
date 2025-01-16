package com.dsa.LeetCode;
import com.sun.jdi.IntegerType;

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
        int arr[] = {0, 0};
        int status = 0;

        for (int i = 0; i < twosum.length; i++)
        {
            if (status == 1)
            {
                break;
            }

            for (int j = i + 1; j < twosum.length; j++)
            {
                if (target == twosum[i] + twosum[j])
                {
                    arr[0] = i;
                    arr[1] = j;
                    status = 1;
                    break;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
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

    // use Hashmap and 1 for loop - most optimum
    int[] TwoSum_4(int[] twosum, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int diff =0;

        for (int i=0; i < twosum.length; i++)
        {
            diff = target - twosum[i];
            map.put(twosum[i], i);

            if (map.containsKey(diff))
            {
                return new int[]{map.get(diff), i};
            }
        }
        return null;
    }

    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();
        int arr[] = {266, 45, 159, 14, 67, 15, 100};

        //ts.TwoSum_1(arr, 29);
        //ts.TwoSum_2(arr, 29);
        //ts.TwoSum_3(arr, 29);

        int index[] = ts.TwoSum_4(arr, 29);
        Arrays.stream(index).forEach(System.out::println);
    }
}
