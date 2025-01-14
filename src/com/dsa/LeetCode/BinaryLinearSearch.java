package com.dsa.LeetCode;

// The class has both Binary and Linear search algos
public class BinaryLinearSearch
{
    static int LinearSearch(int num[], int t)
    {
        int steps = 0;

        for (int i=0; i<num.length; i++)
        {
            steps++;
            if (t == num[i])
            {
                System.out.println("Steps in Linear Search : " + steps);
                return i;
            }
        }
        return -1;
    }

    static int BinarySearch(int num[], int tar)
    {
        int left = 0;
        int right = num.length-1;
        int mid = 0;
        int steps = 0;

        while (left <= right)
        {
            steps++;
            mid = (left + right)/2;

            if (num[mid]==tar)
            {
                System.out.println("Steps in Binary Search : " + steps);
                return mid;
            }
            else if (tar > num[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        // 16 elements
        int num[] = {2, 5, 7, 10, 12, 15, 20, 24, 30, 37, 42, 50, 55, 62, 68, 70};
        int tar = 62;
        int res1 = BinarySearch(num, tar);
        int res2 = LinearSearch(num, tar);

        if (res1!=-1)
        {
            System.out.println("Number " + tar + " found at index " + res1 + " and " + res2);
        }
        else
        {
            System.out.println("Number " + tar + " not found");
        }
    }
}
