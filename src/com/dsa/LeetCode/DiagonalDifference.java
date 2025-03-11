package com.dsa.LeetCode;

public class DiagonalDifference
{
    int arr[][] = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {70, 8, 90},
    };

    // print and calc diagonal sums and then subtract
    void printDiagonalDiff()
    {
        int left = 0;
        int leftsum = 0;
        int right = 2;
        int rightsum = 0;

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");

                if (left==j)
                {
                    leftsum = arr[i][j] + leftsum;
                }
                if (right==j)
                {
                    rightsum = arr[i][j] + rightsum;
                }
            }
            left++;
            right--;
            System.out.println();
        }
        System.out.println("Left Diagonal sum is " + leftsum);
        System.out.println("Right Diagonal sum is " + rightsum);
        System.out.println("Diagonal difference is " + (leftsum - rightsum));
    }

    // print and calc diagonal sums and then subtract
    void printIndex()
    {
        System.out.println();

        for (int i=0; i<arr.length; i++)
        {
            for (int j=0; j<arr.length; j++)
            {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        DiagonalDifference dd = new DiagonalDifference();
        dd.printIndex();
        dd.printDiagonalDiff();
    }
}
