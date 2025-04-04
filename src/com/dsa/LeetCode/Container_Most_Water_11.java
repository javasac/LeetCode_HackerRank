package com.dsa.LeetCode;
// Leetcode 11 - Container with most water

class Container_Most_Water_11
{
    public int maxArea(int[] height)
    {
        int currArea = 0, maxArea = 0, start = 0;
        int end = height.length - 1;

        while (start <= end)
        {
            currArea = Math.min(height[start], height[end]) * (end - start);

            if (height[start] > height[end])
            {
                end--;
            }
            else
            {
                start++;
            }

            maxArea = Math.max(maxArea, currArea);
        }

        return maxArea;
    }

    public static void main(String[] args)
    {
        Container_Most_Water_11 cm = new Container_Most_Water_11();
        int[] height = {11,8,6,2,5,4,8,3,11};
        //int[] height = {1,1};

        System.out.println("Max Height of Container is " + cm.maxArea(height));
    }
}
