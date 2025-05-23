package com.dsa.LeetCode;
import java.util.Arrays;

public class CoinChange
{
    int coinChange(int[] coins, int amount)
    {
        int[] amt = new int[amount + 1];
        Arrays.fill(amt, amount + 1);
        amt[0] = 0;

        for (int i=1; i<=amount; i++)
        {
            for (int j=0; j<coins.length; j++)
            {
                if (i >= coins[j])
                {
                    amt[i] = Math.min(amt[i], 1 + amt[i-coins[j]]);
                }
            }
        }

        if (amt[amount] < amount + 1)
        {
            return amt[amount];
        }
        else
        {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        CoinChange cc = new CoinChange();
        int[] coins = {1, 3, 5, 6};

        System.out.println("Minimum coins are " + cc.coinChange(coins, 18));
    }
}
