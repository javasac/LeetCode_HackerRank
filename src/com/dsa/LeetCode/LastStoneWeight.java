package com.dsa.LeetCode;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class LastStoneWeight
{
    int StoneWeight(int[] arr)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : arr)
        {
            pq.add(i);
        }

        Iterator<Integer> it = pq.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + ", ");
        }
        System.out.println();

        int x = 0;
        int y = 0;
        while (pq.size() > 1)
        {
            x = pq.poll();
            y = pq.poll();
            System.out.println("Inside while " + x + " and " + y + " Size is " + pq.size());

            if (x != y)
            {
                pq.add(x - y);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args)
    {
        LastStoneWeight ls = new LastStoneWeight();
        int[] arr = {2, 7, 4, 2, 8, 1};
        System.out.println("Return value is " + ls.StoneWeight(arr));
    }
}
  