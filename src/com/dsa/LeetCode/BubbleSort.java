package com.dsa.LeetCode;

// Time Complexity = O(n^2): Exponential Time
public class BubbleSort
{
    void sortBubble()
    {
        int nums[] = {855, 64, 97, 266, 4, 15, 10, -323};
        int rep = 0;

        for (int x=0; x<nums.length; x++)
        {
            for (int i = 0; i<nums.length - 1; i++)
            {
                if (nums[i] > nums[i + 1])
                {
                    rep = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = rep;
                }
            }
        }
        this.printNums(nums);
    }

    void printNums(int nums[])
    {
        for (int i=0; i<nums.length; i++)
        {
            System.out.print(nums[i] + ", ");
        }
    }

    public static void main(String[] args)
    {
        BubbleSort b = new BubbleSort();
        b.sortBubble();
    }
}
