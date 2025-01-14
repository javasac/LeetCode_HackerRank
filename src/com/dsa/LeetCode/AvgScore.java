package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.HashMap;

public class AvgScore
{
    int[][] arr = {{3, 1, 2, 2, 1, 2, 1, 3, 1, 2, 2}, {91, 92, 93, 97, 60, 77, 65, 87, 100, 100, 76}};

    void printArr()
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    void findAvg()
    {
        int[] ctr = {30, 54, 22, 99, 22, 77, 99, 22, 54, 99, 99};
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int num = 0;

        for (int row : ctr)
        {
            if (hm.containsKey(String.valueOf(row)))
            {
                num = hm.get(String.valueOf(row));
                num = num + 1;
                hm.replace(String.valueOf(row), num);
            }
            else
            {
                hm.put(String.valueOf(row), 1);
            }
        }

        // print the Hashmap
        System.out.println(hm);
    }

    // main method
    public static void main(String[] args)
    {
        AvgScore avg = new AvgScore();
        avg.printArr();
        avg.findAvg();
    }
}
