package com.dsa.LeetCode;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

public class HR_JavaDeque
{
    int arr[] = {5, 3, 5, 2, 3, 2};

    void findMax(int sz)
    {
        int max = 0;

        ArrayDeque<Integer> deq = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <arr.length; i++)
        {
            deq.add(arr[i]);
            set.add(arr[i]);

            if (deq.size()==sz)
            {
                System.out.println(deq);
                System.out.println(set);

                if (set.size() > max)
                {
                    max = set.size();
                }

                int num = (int) deq.remove();
                System.out.println("Removing from Deque = " + num);

                if (!deq.contains(num))
                {
                    set.remove(num);
                }
                System.out.println("Set " + set);
                System.out.println();
            }
        }
        System.out.println("Max Set Size is " + max);
    }

    public static void main(String[] args)
    {
        HR_JavaDeque hr = new HR_JavaDeque();
        hr.findMax(3);
    }
}
