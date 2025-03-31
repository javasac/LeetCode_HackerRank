package com.dsa.LeetCode;
// Leetcode 75 remove *
// leet**cod*e updated to lecoe, erase***** to ""

public class RemoveStar
{
    String str = "leet**cod*e";

    String removeStars()
    {
        StringBuffer sb = new StringBuffer();
        char c;

        for (int i=0; i<str.length(); i++)
        {
            c = str.charAt(i);

            if (c >= 'a' && c <= 'z')
            {
                sb.append(c);
            }
            else if (sb.length() > 0)
            {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        RemoveStar rs = new RemoveStar();
        System.out.println("Removed * to get " + rs.removeStars());
    }
}
