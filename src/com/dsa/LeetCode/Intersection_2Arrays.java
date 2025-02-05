package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.HashMap;

public class Intersection_2Arrays
{
    void intersect(int[] a, int[] b)
    {
        int size = Math.min(a.length, b.length);
        int[] res = new int[size];
        HashMap<Integer, Integer> aa = new HashMap<>();
        int ctr = 0;

        for (int i : a)
        {
            if (aa.containsKey(i))
            {
                ctr = aa.get(i);
                ctr++;
                aa.put(i, ctr);
            }
            else
            {
                aa.put(i, 1);
            }
        }

        System.out.println(aa);
        int index = 0;

        for (int i : b)
        {
            if (aa.containsKey(i))
            {
                res[index] = i;
                index++;

                ctr = aa.get(i);
                ctr--;

                if (ctr==0)
                {
                    aa.remove(i);
                }
                else
                {
                    aa.put(i, ctr);
                }
            }
        }

        System.out.println(aa);
        Arrays.stream(res).forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        //int[] a = {4, 9, 5, 4, 4};
        //int[] b = {9, 4, 9, 8, 4};

        int[] a = {1, 2, 2, 1, 7, 3};
        int[] b = {2, 7, 3};

        Intersection_2Arrays ia = new Intersection_2Arrays();
        ia.intersect(a, b);
    }
}
