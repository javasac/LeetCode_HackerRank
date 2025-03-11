package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.Arrays;

// Time Complexity is O(n^2) and Space is O(n)
public class Three_Number_Sum
{
    void find3Sum(int arr[], int target)
    {
        ArrayList<Integer[]> list = new ArrayList<Integer[]>();
        Arrays.sort(arr);
        for (int i : arr)
        {
            System.out.print(i + "  ");
        }
        System.out.println();

        int sum = 0;
        int cur = 0;
        int left = 0;
        int right = 0;

        for (int i=0; i<arr.length; i++)
        {
            cur = i;
            left = i + 1;
            right = arr.length-1;

            for (int x=i+1; x<arr.length; x++)
            {
                sum = arr[cur] + arr[left] + arr[right];

                if (target==sum)
                {
                    System.out.println("Target is equal to " + arr[cur] + "+" + arr[left] + "+" + arr[right]);
                    Integer[] combo = new Integer[]{arr[cur], arr[left], arr[right]};
                    left++;
                    right--;
                }
                if (target > sum)
                {
                    left++;
                }
                if (target < sum)
                {
                    right--;
                }
            }
        }

        System.out.println(list);
    }

    public static void main(String[] args)
    {
        int arr[] = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        Three_Number_Sum tns = new Three_Number_Sum();
        tns.find3Sum(arr, 0);
    }
}
