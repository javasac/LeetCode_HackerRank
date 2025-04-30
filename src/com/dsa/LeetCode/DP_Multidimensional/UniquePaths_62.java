package com.dsa.LeetCode.DP_Multidimensional;

class UniquePaths_62
{
    public int UniquePaths(int m, int n)
    {
        int[][] dp = new int[m][n];

        // first elememt in each row is 1
        for (int i=0; i<m; i++)
        {
            dp[i][0] = 1;
        }

        // first elememt in each column is 1
        for (int i=0; i<n; i++)
        {
            dp[0][i] = 1;
        }

        this.printArray(dp, m, n);

        for (int r=1; r<m; r++)
        {
            for (int c = 1; c < n; c++)
            {
                dp[r][c] = dp[r-1][c] + dp[r][c-1];
            }
        }

        this.printArray(dp, m, n);
        return dp[m-1][n-1];
    }

    // print the Array
    void printArray(int[][] arr, int r, int c)
    {
        for (int a = 0; a < r; a++)
        {
            for (int b = 0; b < c; b++)
            {
                System.out.print(arr[a][b] + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        UniquePaths_62 up = new UniquePaths_62();

        System.out.println("Unique Paths are " + up.UniquePaths(3, 7));
    }
}
