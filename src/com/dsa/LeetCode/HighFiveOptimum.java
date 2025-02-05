package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFiveOptimum
{
    int[][] highFive(int[][] items)
    {
        TreeMap<Integer, PriorityQueue<Integer>> scores = new TreeMap<>();

        for (int[] item : items)
        {
            int id = item[0];
            int score = item[1];

            if (!scores.containsKey(id))
            {
                scores.put(id, new PriorityQueue<>((a, b) -> b-a));
            }
            scores.get(id).add(score);
        }

        List<int[]> ans = new ArrayList<>();

        for (int id : scores.keySet())
        {
            int sum = 0;

            for (int i=0; i<5; i++)
            {
                sum = sum + scores.get(id).poll();
            }
            ans.add(new int[]{id, sum/5});
        }

        int[][] ansArray = new int[ans.size()][];
        return ans.toArray(ansArray);
    }

    public static void main(String[] args)
    {
        int[][] arr = {{3, 1, 2, 2, 1, 2, 1, 3, 1, 2, 2}, {91, 92, 93, 97, 60, 77, 65, 87, 100, 100, 76}};

        HighFiveOptimum ho = new HighFiveOptimum();
        int[][] ans = ho.highFive(arr);
    }
}
