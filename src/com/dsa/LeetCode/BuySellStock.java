package com.dsa.LeetCode;

public class BuySellStock
{
    void maxProfit(int prices[])
    {
        int profit = 0;
        int min = prices[0];

        for (int i=0; i<prices.length; i++)
        {
            if (prices[i] < min)
            {
                min = prices[i];
            }
            //profit = Math.max(profit, prices[i] - min);
            if ((prices[i] - min) > profit)
            {
                profit = prices[i] - min;
            }

            System.out.println(min + ", " + prices[i] + ", " + profit);
        }
        System.out.println("Max profit is " + profit);
    }

    public static void main(String[] args)
    {
        BuySellStock bs = new BuySellStock();
        int arr[] = {7, 10, 5, 30, 61, 4};
        bs.maxProfit(arr);
    }
}
