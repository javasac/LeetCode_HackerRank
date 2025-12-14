package com.dsa.AlgoExpert;
import java.util.Arrays;

// Time Complexity is O(n^2) and Space Complexity is O(n).
public class BubbleSort
{
    void Bubble(int[] arr)
    {
        int temp = 0;
        Arrays.stream(arr).forEach(i -> System.out.print(i + ", "));
        System.out.println();

        for (int i=0; i<arr.length-1; i++)
        {
            for (int j=0; j<arr.length-1; j++)
            {
                temp = arr[j];

                if (temp > arr[j + 1])
                {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        Arrays.stream(arr).forEach(i -> System.out.print(i + ", "));
    }

    public static void main(String[] args)
    {
        BubbleSort bs = new BubbleSort();

        int arr[] = {8, 5, 2, 9, 5, 6, 3};
        bs.Bubble(arr);
    }
}
