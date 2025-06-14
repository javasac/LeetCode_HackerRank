package com.dsa.LeetCode;
import java.util.*;

public class MergeInterval_LC56
{
    void mergeIntervals(int[][] intervals)
    {
        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);

        System.out.println(newInterval[0] + " and " + newInterval[1]);

        for (int[] row : intervals)
        {
            if (row[0] <= newInterval[1])
            {
                //newInterval[1] = row[1];
                newInterval[1] = Math.max(row[1], newInterval[1]);
            }
            else
            {
                newInterval = row;
                result.add(newInterval);
            }
        }

        Iterator it = result.iterator();
        int[] prt = new int[]{};
        while (it.hasNext())
        {
            prt = (int[])it.next();
            System.out.println(prt[0] + " " + prt[1]);
        }
    }

    void printArr(int[][] arr)
    {
        for (int[] row : arr)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args)
    {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {8, 9}, {9, 11}, {15, 18}, {2, 4}, {16, 17}};
        MergeInterval_LC56 mi = new MergeInterval_LC56();

        mi.mergeIntervals(intervals);
    }
}
