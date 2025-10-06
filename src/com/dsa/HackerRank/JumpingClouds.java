package com.dsa.HackerRank;

public class JumpingClouds
{
    //int arr[] = {0, 0, 1, 0, 0, 1, 0};
    int arr[] = {0, 0, 0, 0, 1, 0};
    int n = 6;
    int len = arr.length;

    void jumps()
    {
        int max = 0, i = 0;

        while (i < len)
        {
            if ((i+2 < len) && (arr[i+2]==0))
            {
                i = i + 2;
                max++;
            }
            else if ((i+1 < len) && (arr[i+1]==0))
            {
                i = i + 1;
                max++;
            }
            else
            {
                i++;
            }
            System.out.println("i = " + i + " max = " + max);
        }
        System.out.println("Jumps are " + max);
    }

    public static void main(String[] args)
    {
        JumpingClouds jc = new JumpingClouds();
        jc.jumps();
    }
}
