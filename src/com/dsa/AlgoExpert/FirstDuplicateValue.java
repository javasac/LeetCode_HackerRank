package com.dsa.AlgoExpert;
import java.util.HashMap;

public class FirstDuplicateValue
{
    int duplicateVal(int[] arr)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr)
        {
            if (map.containsKey(n))
            {
                return n;
            }

            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        return -1;
    }

    public static void main(String[] args)
    {
        FirstDuplicateValue fd = new FirstDuplicateValue();
        int[] arr = {2, 1, 5, 3, 2, 3, 4};
        System.out.println("First Duplicate Value is " + fd.duplicateVal(arr));
    }
}
