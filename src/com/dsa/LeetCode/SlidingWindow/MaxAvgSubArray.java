package com.dsa.LeetCode.SlidingWindow;
// LeetCode 643

class MaxAvgSubArray
{
    double findMaxAverage(int[] nums, int k)
    {
        int ctr;
        double max = 0d, avg = 0d;

        for (int i=0; i<=nums.length-k; i++)
        {
            ctr = 1;
            avg = 0d;

            for (int x=i; ctr<=k; x++)
            {
                avg = avg + nums[x];
                ctr++;
            }

            avg = avg / k;
            System.out.println("Avg is " + avg);
            max = Math.max(max, avg);
        }
        return max;
    }

    public static void main(String[] args)
    {
        MaxAvgSubArray ma = new MaxAvgSubArray();

        int[] nums = new int[]{1, 1200, -500, -6, 50, 300};
        System.out.println("Max subarrays is " + ma.findMaxAverage(nums, 3));
    }
}
