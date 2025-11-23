package com.dsa.AlgoExpert;
import java.util.Arrays;
// Time Complexity = O(n) and Space Complexity = O(n)

public class TwoSum
{
    int[] calcTwoSum(int[] arr, int tar)
    {
        Arrays.sort(arr);
        int st = 0, en = arr.length-1, sum = 0;

        while (st < en)
        {
            sum = arr[st] + arr[en];
            System.out.println(arr[st] + " + " + arr[en] + " = " + sum);

            if (sum == tar)
            {
                System.out.println("Sum found at Index = " + st + " and " + en);
                return new int[] {st, en};
            }
            else if (sum > tar)
            {
                en--;
            }
            else
            {
                st++;
            }
        }
        System.out.println("Target not found.");
        return new int[0];
    }

    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();

        int arr[] = {-1, 0, 1, 2, -1, -4};
        int target = 3;
        int[] fo = ts.calcTwoSum(arr, target);

        Arrays.stream(fo).forEach(a -> System.out.println(a));
    }
}
