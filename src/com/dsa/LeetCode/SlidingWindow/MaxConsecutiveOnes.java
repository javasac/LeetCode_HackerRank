package com.dsa.LeetCode.SlidingWindow;
// LeetCode 1004

public class MaxConsecutiveOnes
{
    public int longestOnes(int[] nums, int k)
    {
        int i = 0, j = 0;

        while (j < nums.length)
        {
            if (nums[j++] == 0)
            {
                k--;
            }

            if (k < 0)
            {
                if (nums[i++] == 0)
                {
                    k++;
                }
            }
        }
        // end of while

        return j - i;
    }

    public static void main(String[] args)
    {
        MaxConsecutiveOnes mo = new MaxConsecutiveOnes();

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        System.out.println("Max Consecutive Ones = " + mo.longestOnes(nums, k));
    }
}
