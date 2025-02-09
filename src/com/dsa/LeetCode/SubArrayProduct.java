package com.dsa.LeetCode;

public class SubArrayProduct
{
    void subArray(int[] arr)
    {
        int cur = 1;
        int max = arr[0];

        for (int i : arr)
        {
            if (i > 0)
            {
                cur = cur * i;
            }
            else
            {
                cur = 1;
            }
            max = Math.max(cur, max);

            System.out.println("Curr = " + cur + " and Max is " + max);
        }
        System.out.println("Max is " + max);
    }

    public static void main(String[] args)
    {
        SubArrayProduct msa = new SubArrayProduct();

        int[] arr = new int[]{-3, 2, 5, 8, 5, -1, 2, 3, -5};
        msa.subArray(arr);
    }

}
