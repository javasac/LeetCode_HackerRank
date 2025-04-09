// LeetCode - 48
package com.dsa.LeetCode;

public class RotateImage_48
{
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    void transpose()
    {
        int temp = 0;
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<=i; j++)
            {
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        printArray();
    }

    void reverseRows()
    {
        int left, right, temp;

        for (int i=0; i<arr.length; i++)
        {
            left = 0;
            right = arr.length - 1;

            while (left <= right)
            {
                temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }

        printArray();
    }

    void printArray()
    {
        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        RotateImage_48 ri = new RotateImage_48();
        ri.printArray();
        System.out.println();
        ri.transpose();
        System.out.println();
        ri.reverseRows();
    }
}
