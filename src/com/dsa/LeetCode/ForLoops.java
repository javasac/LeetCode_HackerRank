package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.List;

public class ForLoops
{
    public static void main(String[] args)
    {
        List<Integer> lt = Arrays.asList(1, 2, 3, 4, 5);

        lt.forEach(System.out::println);
        lt.forEach(i -> System.out.println(i));
        lt.parallelStream().forEach(System.out::println);

        for (int i : lt)
        {
            System.out.println(i);
        }

        int arr[] = {1, 2, 3, 4, 5};

        Arrays.stream(arr).forEach(System.out::println);

        System.out.println();
        for (int n : arr)
        {
            System.out.print(n + ", ");
        }
    }
}
