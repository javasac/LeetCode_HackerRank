package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AllDuplicates_LC_442
{
    List<Integer> findDuplicates(int[] nums)
    {
        Set<Integer> hs = new HashSet<>();
        List<Integer> lt = new ArrayList<>();

        for (int i=0; i<nums.length; i++)
        {
            if (hs.contains(nums[i]))
            {
                lt.add(nums[i]);
            }
            else
            {
                hs.add(nums[i]);
            }
        }

        lt.stream().forEach(System.out::println);
        return lt;
    }

    public static void main(String[] args)
    {
        AllDuplicates_LC_442 ad = new AllDuplicates_LC_442();
        int[] arr = {3, 4, 2, 6, 7, 1, 3, 2, 7};

        ad.findDuplicates(arr);
    }
}
