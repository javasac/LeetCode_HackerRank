package com.dsa.AlgoExpert;
import java.util.*;

// Time Complexity = O(n * n) and Space Complexity = O(n)
public class ThreeSumTriplet
{
    List<Integer[]> sumTrip(int[] arr, int tar)
    {
        Arrays.sort(arr);
        List<Integer[]> result = new ArrayList<>();
        int sum = 0;

        for (int i=0; i<arr.length -2; i++)
        {
            int left = i+1;
            int right = arr.length - 1;

            while (left < right)
            {
                sum = arr[i] + arr[left] + arr[right];

                if (sum == tar)
                {
                    result.add(new Integer[]{arr[i], arr[left], arr[right]});
                    left++;
                    right--;
                }
                else if (sum > tar)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int arr[] = {-1, 0, 1, 2, -1, -4};
        int tar = 0;

        //int arr[] = {12, 3, 1, 2, -6, 5, -8, 6};
        //int tar = 0;

        ThreeSumTriplet ts = new ThreeSumTriplet();
        List<Integer[]> thr = ts.sumTrip(arr, tar);

        Integer[] res;
        Iterator<Integer[]> it = thr.iterator();

        while (it.hasNext())
        {
            res = it.next();
            for (int i=0; i<res.length; i++)
            {
                System.out.print(res[i] + ", ");
            }
            System.out.println();
        }
    }
}
