package com.dsa.AlgoExpert;
import java.util.Arrays;

public class NonConstructibleChange
{
    int findLowest(int[] coin)
    {
        int sum = 0;
        Arrays.sort(coin);

        for (int i=0; i<coin.length; i++)
        {
            if (coin[i] > (sum + 1))
            {
                System.out.println((sum + 1) + " and next is " + coin[i]);
                return (sum + 1);
            }
            else
            {
                sum = sum + coin[i];
                System.out.println("Sum is " + sum);
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        NonConstructibleChange nc = new NonConstructibleChange();
        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        //int[] coins = {5, 1, 2};

        System.out.println();
        System.out.println("Lowest Non Constructible Change = " + nc.findLowest(coins));
    }
}
