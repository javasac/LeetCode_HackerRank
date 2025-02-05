package com.dsa.LeetCode;
//0 - 1, 1 - 2, 2 - 3, 3 - 6, 4 - 7, 5 - 14, 6 - 15, 7 - 30, 8 - 31, 9 - 62

public class UtopianTree
{
    public static void main(String[] args)
    {
        int period = 9;
        int height = 0;
        int i = 0;

        while (i <= period)
        {
            if (i % 2 == 0)
            {
                height = height + 1;
            }
            else
            {
                height = height * 2;
            }

            System.out.println(height);
            i++;
        }
        System.out.println("Height after " + period + " periods is " + height);
    }
}
