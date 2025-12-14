package com.dsa.AlgoExpert;
import java.util.*;

public class MissingNumbers
{
    int[] missNum(int[] num)
    {
        Set<Integer> set = new HashSet<>();

        for (int i=1; i<=num.length+2; i++)
        {
            set.add(i);
        }
        System.out.println(set);

        for (int n : num)
        {
            set.remove(n);
        }

        List<Integer> li = new ArrayList<>(set);
        return new int[]{li.get(0), li.get(1)};
    }

    public static void main(String[] args)
    {
        MissingNumbers mn = new MissingNumbers();

        int[] nums = {2, 4, 3, 5};
        Arrays.stream(mn.missNum(nums)).forEach(System.out::println);
    }
}
