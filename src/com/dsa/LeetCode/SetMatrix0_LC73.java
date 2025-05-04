// if an element is 0, set its entire row and column as Zero.
// Time Complexity is O(m * n) and Space Complexity is O(m + n)
package com.dsa.LeetCode;
import java.util.HashSet;
import java.util.Set;

public class SetMatrix0_LC73
{
    int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int rows = arr.length;
    int cols = arr[0].length;

    void PrintArray()
    {
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Row # " + rows + " and Cols # " + cols);
    }

    // set 0s
    void setZeroes()
    {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (arr[i][j] == 0)
                {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (rowSet.contains(i) || rowSet.contains(j))
                {
                    arr[i][j] = 0;
                }
            }
        }

        this.PrintArray();
    }

    public static void main(String[] args)
    {
        SetMatrix0_LC73 sm = new SetMatrix0_LC73();
        sm.PrintArray();
        sm.setZeroes();
    }
}
