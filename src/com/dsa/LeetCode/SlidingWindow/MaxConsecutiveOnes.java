package com.dsa.LeetCode.SlidingWindow;
// LeetCode 1004 - Maximum Consecutive Ones

class MaxConsecutiveOnes
{
    public int longestOnes(int[] nums, int k)
    {
        int zeros_flipped = 0, max_ones = 0, start = 0;

        for (int end=0; end<nums.length; end++)
        {
            if (nums[end] == 0)
            {
                zeros_flipped++;
            }

            while (zeros_flipped > k)
            {
                if (nums[start] == 0)
                {
                    zeros_flipped--;
                }
                start++;
            }

            max_ones = Math.max(max_ones, (end - start + 1));
            System.out.println("Zeros Flip = " + zeros_flipped + " Current Ones = " +
                    (end - start + 1) + " Max Ones = " + max_ones);
        }

        return max_ones;
    }

    public static void main(String[] args)
    {
        MaxConsecutiveOnes mo = new MaxConsecutiveOnes();

        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;

        System.out.println("Max Consecutive Ones = " + mo.longestOnes(nums, k));
    }
}
