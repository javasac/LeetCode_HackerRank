package com.dsa.LeetCode;
import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays
{
    int[] a = {3, 7, 9, 10};
    int[] b = {4, 1, 6, 8};

    void mergeArrays()
    {
        int[] mer = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        //Arrays.stream(mer).forEach(System.out::println);
        Arrays.stream(mer).forEach(i-> System.out.println(i));
    }

    public static void main(String[] args)
    {
        MergeArrays ma = new MergeArrays();
        ma.mergeArrays();
    }
}
