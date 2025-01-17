package com.dsa.LeetCode;

// Time Complexity = O(2^n): Exponential Time
public class BubbleSort
{
    void sortBubble()
    {
        int nums[] = {8545, 64, 97, 266, 4, 15, 10, -323};
        int rep = 0;

        for (int x=0; x<nums.length; x++)
        {
            for (int i = 0; i < nums.length - 1; i++)
            {
                System.out.println("Comparing " + nums[i] + " " + nums[i + 1]);

                if (nums[i] > nums[i + 1])
                {
                    rep = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = rep;
                }
            }
            this.printNums(nums);
        }
    }

    void printNums(int nums[])
    {
        System.out.println("=====Print Start=====");
        for (int i=0; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println("=====Print End=====");
    }

    public static void main(String[] args)
    {
        BubbleSort b = new BubbleSort();
        b.sortBubble();
    }
}
