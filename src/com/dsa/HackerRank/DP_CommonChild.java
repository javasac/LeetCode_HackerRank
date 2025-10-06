// Longest Common Sub-Sequence
// Time Complexity = O (m*n), Space Complexity = O (m*n)
package com.dsa.HackerRank;

public class DP_CommonChild
{
    String str1 = "ZFBCDZB";    //ABCDEF
    String str2 = "ZBCDF";      //FBDAMN

    void child()
    {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        int max = 0;

        System.out.println(str1.length() + " and " + str2.length());

        for (int i = 1; i <= str1.length(); i++)
        {
            for (int j = 1; j <= str2.length(); j++)
            {
                if (a[i] == b[j])
                {
                    dp[i][j] = 1 + dp[i-1][j-1];

                    max = Math.max(dp[i][j], max);
                }
                System.out.println("Max is " + max + ", " + i + " and " + j);
            }
        }

        printArray(dp, str1.length(), str2.length());
        System.out.println("Longest Common Sub-Sequence is " + max);
    }

    void printArray(int[][] arr, int a, int b)
    {
        for (int i=0; i<a; i++)
        {
            for (int j=0; j<b; j++)
            {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        DP_CommonChild cc = new DP_CommonChild();
        cc.child();
    }
}
