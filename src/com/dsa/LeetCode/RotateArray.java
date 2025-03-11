package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.List;

public class RotateArray
{
    List<Integer> nums;

    public RotateArray()
    {
        nums = List.of(1, 2, 3, 4, 5, 6, 7);
    }

    List<Integer> rotate(int k)
    {
        List<Integer> lt = new ArrayList<>();
        int arr[] = new int[k];

        for (int i=0; i<k; i++)
        {
            arr[i] = nums.get(i);
            //System.out.print(arr[i] + ", ");
        }

        System.out.println();
        int ctr = 0;

        for (Integer t : nums)
        {
            if (ctr < k)
            {
                ctr++;
            }
            else
            {
                lt.add(t);
            }
        }

        for (int i=0; i<k; i++)
        {
            lt.add(arr[i]);
        }

        return lt;
    }

    public static void main(String[] args)
    {
        RotateArray ra = new RotateArray();
        List<Integer> fin = ra.rotate(3);
        System.out.println(fin);
    }
}
