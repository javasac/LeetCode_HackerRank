package com.dsa.LeetCode.TopKElements;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElements
{
    void topK(int[] arr, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        int ctr = 0;

        for (int i : arr)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int n : map.keySet())
        {
            pq.add(n);

            if (pq.size() > k)
            {
                pq.poll();
            }
        }

        int ans[] = new int[k];
        for (int x = 0; x < ans.length; x++)
        {
            ans[x] = pq.poll();
            System.out.println(ans[x]);
        }
    }

    public static void main(String[] args)
    {
        int num[] = {10, 50, 20, 50, 80, 20, 10, 10, 20, 20};
        TopKElements tk = new TopKElements();
        tk.topK(num, 2);
    }
}
