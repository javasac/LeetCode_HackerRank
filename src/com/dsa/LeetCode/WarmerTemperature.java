package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.List;

public class WarmerTemperature
{
    // {1, 1, 4, 2, 1, 1, 0, 0}
    int[] temp = {73, 74, 75, 71, 69, 72, 76, 73};

    void printWarm()
    {
        List<Integer> lst = new ArrayList<>();

        for (int x=0; x<temp.length; x++)
        {
            boolean bool = Boolean.FALSE;

            for (int y=x+1; y<temp.length; y++)
            {
                if (temp[y] > temp[x])
                {
                    bool = Boolean.TRUE;
                    lst.add(y-x);
                    break;
                }
            }
            if (bool == Boolean.FALSE)
            {
                lst.add(0);
            }
        }

        for (Integer g : lst)
        {
            System.out.print(g + ", ");
        }
    }

    public static void main(String[] args)
    {
        WarmerTemperature wm = new WarmerTemperature();
        wm.printWarm();
    }
}
