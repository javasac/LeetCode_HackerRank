package com.dsa.CodeSignal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC_1
{
    void findTwoSum(int[] arr, int tar)
    {
        int le = 0, ri = arr.length - 1, sum = 0;
        Arrays.sort(arr);

        while (le < ri)
        {
            sum = arr[le] + arr[ri];

            if (sum == tar)
            {
                System.out.println("Target = " + tar + " found with " + arr[le] + " and " + arr[ri]);
                break;
            }
            else if (sum > tar)
            {
                ri--;
            }
            else
            {
                le++;
            }
        }
    }

    // use a map
    void find2SumMap(int[] arr, int tar)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int diff = 0;

        for (int i=0; i<arr.length; i++)
        {
            diff = tar - arr[i];

            if (map.containsKey(diff))
            {
                System.out.println("Target = " + tar + " found with " + arr[i] + " and " + diff);
            }
            else
            {
                map.put(arr[i], i);
            }
        }
    }

    public static void main(String[] args)
    {
        TwoSum_LC_1 ts = new TwoSum_LC_1();

        int[] arr = {7, 8, 1, 3, 11, 4};
        int tar = 19;
        ts.findTwoSum(arr, tar);
        ts.find2SumMap(arr, tar);
    }
}
