package com.dsa.LeetCode.DynamicProgram;
// Number of ways you can climb n stairs.

public class ClimbStairs_LC_70
{
    public int climbStairs(int n)
    {
        if (n == 1)
            return 1;

        int[] st = new int[n+1];
        st[1] = 1;
        st[2] = 2;

        for (int i=3; i<=n; i++)
        {
            st[i] = st[i-2] + st[i-1];
        }

        return st[n];
    }

    public static void main(String[] args)
    {
        ClimbStairs_LC_70 cs = new ClimbStairs_LC_70();

        System.out.println("Number of ways to climb N stairs is " + cs.climbStairs(3));
    }
}
