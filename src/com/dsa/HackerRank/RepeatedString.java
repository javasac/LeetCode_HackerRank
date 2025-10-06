package com.dsa.HackerRank;

public class RepeatedString
{
    String str = "abcda";
    int len = 11;
    char fi = 'a';

    void repeat()
    {
        int ctr = 0, rem = 0;

        for (int i=0; i<str.length(); i++)
        {
            if (fi==str.charAt(i))
            {
                ctr++;
            }
        }

        System.out.println("Count is " + ctr);
        ctr = ctr + (len / str.length());
        System.out.println("Count is " + ctr);

        for (int i=0; i<=(len % str.length()); i++)
        {
            if (fi==str.charAt(i))
            {
                rem++;
            }
        }

        ctr = ctr + rem;
        System.out.println("Count is " + ctr);
    }

    public static void main(String[] args)
    {
        RepeatedString rs = new RepeatedString();
        rs.repeat();
    }
}
