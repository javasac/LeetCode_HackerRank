package com.dsa.LeetCode;
// Time Complexity = 0(log 0) and Space Complexity = O(1)

public class LeetCode_540
{
    public int singleNonDuplicate(int[] nums)
    {
        int left = 0, mid = 0, len = 0;
        int right = nums.length - 1;

        while (left < right)
        {
            mid = left + (right - left)/2;

            if (nums[mid] == nums[mid + 1])
            {
                mid = mid - 1;
            }
            len = mid - left + 1;

            if (len % 2 == 1)
            {
                right = mid;
            }
            else
            {
                left = mid + 1;
            }
        }

        return nums[left];
    }

    public static void main(String[] args)
    {
        LeetCode_540 lc = new LeetCode_540();
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 8};

        System.out.println("Single element in sorted Array = " + lc.singleNonDuplicate(nums));
    }
}
