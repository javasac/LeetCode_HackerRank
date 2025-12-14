package com.dsa.AlgoExpert;

public class BestSeat
{
    int bestSeat(int[] seats)
    {
        int ctr = 0, max = 0, i = 0;

        while (i < seats.length)
        {
            if (seats[i] == 0)
            {
                ctr++;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] seats = {1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0};
        BestSeat bs = new BestSeat();

        System.out.println("Max Zeroes are " + bs.bestSeat(seats));
    }
}
