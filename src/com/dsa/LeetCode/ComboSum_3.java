package com.dsa.LeetCode;
// k=3, n=9, [{1, 2, 6}, {1, 3, 5}, {2, 3, 4}]
// k=3, n=7, [{1, 2, 4}]
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ComboSum_3
{
    void findSum(int k, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i=1; i<=target; i++)
        {
            System.out.println(i + "+" + (i+1));
        }

        System.out.println("Sum is " + map);
    }

    public static void main(String[] args)
    {
        ComboSum_3 cs = new ComboSum_3();
        cs.findSum(3, 7);
    }
}
