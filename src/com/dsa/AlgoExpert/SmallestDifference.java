package com.dsa.AlgoExpert;
import java.util.Arrays;

public class SmallestDifference
{
    //int[] calc(int[] one, int[] two)
    void calc(int[] one, int[] two)
    {
        int[] re = new int[2];
        int diff = 0;

        Arrays.sort(one);
        Arrays.sort(two);

        for (int i=0; i<one.length; i++)
        {
            System.out.println("Diff = " + (two[i] - one[i]));
        }

        //return re;
        //Arrays.stream(re).forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        SmallestDifference sd = new SmallestDifference();

        int[] one = {1, 5, 10, 20, 28, 3};
        int[] two = {26, 134, 135, 15, 17};

        sd.calc(one, two);
    }
}
