package com.dsa.LeetCode;

public class AllWrong_FB
{
    String getWrongAnswers(int N, String C)
    {
        StringBuffer str = new StringBuffer();
        char ch[] = C.toCharArray();

        for (int i=0; i<N; i++)
        {
            if (ch[i] == 'A')
                str.append("B");
            else
                str.append("A");
        }

        return str.toString();
    }

    public static void main(String[] args)
    {
        AllWrong_FB wr = new AllWrong_FB();
        System.out.println("All wrong are " + wr.getWrongAnswers(3, "ABA"));
    }
}
