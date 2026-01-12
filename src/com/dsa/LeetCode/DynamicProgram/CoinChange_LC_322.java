package com.dsa.LeetCode.DynamicProgram;
import java.util.Arrays;

public class CoinChange_LC_322
{
    int CountCoins(int[] coins, int amt)
    {
        int[] amount = new int[amt+1];
        Arrays.fill(amount, amt+1);
        amount[0] = 0;

        for (int i=1; i<amount.length; i++)
        {
            System.out.println("===========" + amount[i]);

            for (int j=0; j<coins.length; j++)
            {
                System.out.println("inside = " + coins[j]);

                if (i >= coins[j])
                {
                    System.out.println(amount[i] + ", " + coins[j] + ", " + amount[i - coins[j]]);
                    amount[i] = Math.min(amount[i], 1 + amount[i - coins[j]]);
                    System.out.println(amount[i]);
                }
            }
        }

        return 0;
    }

    public static void main(String[] args)
    {
        CoinChange_LC_322 cc = new CoinChange_LC_322();
        int[] coins = {1, 5, 6, 9};

        System.out.println("Number of Coins are " + cc.CountCoins(coins, 11));
    }
}
