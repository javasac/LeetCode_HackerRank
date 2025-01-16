package com.dsa.LeetCode;
import java.util.Arrays;

public class ContainsDuplicate
{
    // brute force
    boolean containsDuplVal(int arr[])
    {
        int val = 0;

        for (int i=0; i<arr.length; i++)
        {
            val = arr[i];

            for (int j=i+1; j<arr.length; j++)
            {
                System.out.println(val + " vs " + arr[j]);

                if (val==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
    }

    // sort the Array, makes it efficient
    boolean findDuplicate(int arr[])
    {
        int val = arr[0];
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        for (int i=0; i<arr.length-1; i++)
        {
            val = arr[i];
            System.out.println(val + " vs " + arr[i+1]);

            if (val==arr[i+1])
            {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args)
    {
        int arr[] = {40, 7, 13, 71, 456, 4};
        ContainsDuplicate cd = new ContainsDuplicate();

        //System.out.println(cd.containsDuplVal(arr));
        System.out.println(cd.findDuplicate(arr));
    }
}
