package com.dsa.CodeSignal;

import java.util.Arrays;

public class MoveZeroes_LC_283
{
    void moveZero(int[] arr)
    {
        int ind = 0, temp = 0;

        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] != 0)
            {
                arr[ind] = arr[i];
                ind++;
            }
        }
        System.out.println("Index is " + ind);

        while (ind < arr.length)
        {
            arr[ind] = 0;
            ind++;
        }

        Arrays.stream(arr).forEach(x -> System.out.print(x + ", "));
    }

    public static void main(String[] args)
    {
        MoveZeroes_LC_283 mz = new MoveZeroes_LC_283();
        //int[] arr = {0, 1, 5, 0, 12, 0, 9};
        int[] arr = {0, 1, 7, 0};

        mz.moveZero(arr);
    }
}
