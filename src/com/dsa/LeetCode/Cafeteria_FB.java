package com.dsa.LeetCode;

class Cafeteria_FB
{
    long getMaxAdditionalDinersCount(long N, long K, int M, long[] se)
    {
        int n = (int)N;
        int arr[] = new int[n];
        long ctr = 0l;
        long newOcc[];

        for (int i=0; i<n; i++)
        {
            arr[i] = i + 1;

            System.out.print(arr[i] + ", ");

            if (checkSeat(arr[i], K, se)==false)
            {
                ctr++;
            }

            System.out.println(checkSeat(arr[i], K, se));
        }
        System.out.println("Final Counter is " + ctr);
        return ctr;
    }

    boolean checkSeat(int x, long K, long occ[])
    {
        for (int i=0; i<occ.length; i++)
        {
            if (x == occ[i] || x+K == occ[i] || x-K == occ[i])
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Cafeteria_FB cf = new Cafeteria_FB();
        long[] s = {2, 6};

        cf.getMaxAdditionalDinersCount(10, 1, 2, s);
    }
}
