package com.dsa.LeetCode;

// find max sub array
public class MaxSubArraySum
{
    void subArray(int[] arr)
    {
        int cur = 0;
        int max = arr[0];

        for (int i : arr)
        {
            if (i > 0)
            {
                cur = cur + i;
            }
            else
            {
                cur = 0;
            }
            max = Math.max(cur, max);

            System.out.println("Curr = " + cur + " and Max is " + max);
        }
        System.out.println("Max is " + max);
    }

    public static void main(String[] args)
    {
        MaxSubArraySum msa = new MaxSubArraySum();
        int[] arr = new int[]{-3, 2, 5, 8, 5, -1, 2, 3, -5, 34, 34, 2};
        msa.subArray(arr);
    }
}
