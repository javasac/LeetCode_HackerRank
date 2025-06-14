package com.dsa.LeetCode.HashMap_Set;
import java.util.Arrays;

class EqualRowColumn
{
    void equalPairs(int[][] rows)
    {
        int n=0;
        int[][] cols = new int[rows.length][rows.length];

        for (int x=0; x<rows.length; x++)
        {
            for (int y=0; y<rows.length; y++)
            {
                cols[y][x] = rows[x][y];
            }
        }

        printArray(cols);
        System.out.println("Equal pairs = " + equalPairs(rows, cols));
    }

    // compare Arrays
    int equalPairs(int[][] rows, int[][] cols)
    {
        int n = 0;
        int[] r, c;

        for (int x=0; x < rows.length; x++)
        {
            r = rows[x];

            for (int y=0; y < cols.length; y++)
            {
                c = cols[y];

                if (Arrays.equals(r, c))
                {
                    n++;
                }
            }
        }
        return n;
    }

    void printArray(int[][] arr)
    {
        for (int x=0; x<arr.length; x++)
        {
            for (int y=0; y<arr.length; y++)
            {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        EqualRowColumn ee = new EqualRowColumn();
        int[][] grid = {{3,1,2,2}, {1,4,4,5}, {2,4,2,2}, {2,4,2,2}};

        ee.equalPairs(grid);
    }
}
