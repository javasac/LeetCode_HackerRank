package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_LC_287
{
    // brute force
    boolean bruteForce(int arr[])
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
    boolean sortArray(int arr[])
    {
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);

        for (int i=0; i<arr.length-1; i++)
        {
            System.out.println(arr[i] + " vs " + arr[i+1]);

            if (arr[i]==arr[i+1])
            {
                return true;
            }
        }
        return false;
    }

    Set<Integer> findDuplSet(int arr[])
    {
        Set<Integer> s = new HashSet<>();

        for (int i=0; i<arr.length; i++)
        {
            if (s.contains(arr[i]))
            {
                System.out.println(arr[i] + " is Duplicate.");
                return s;
            }
            else
            {
                s.add(arr[i]);
            }
        }
        return s;
    }

    public static void main(String[] args)
    {
        int arr[] = {40, 71, 13, 100, 456, 40, 10, 8905};
        ContainsDuplicate_LC_287 cd = new ContainsDuplicate_LC_287();

        //System.out.println(cd.bruteForce(arr));
        //System.out.println(cd.sortArray(arr));
        Set s = cd.findDuplSet(arr);

        s.forEach(System.out::println);
    }
}
