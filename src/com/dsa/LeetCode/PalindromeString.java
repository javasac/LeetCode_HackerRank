package com.dsa.LeetCode;

public class PalindromeString
{
    String str[] = {"Cricket", "Mam", "Madam", "Ball", "Yeley"};

    // check each string for Palindrome
    String findPalindrome()
    {
        StringBuffer sb = new StringBuffer();
        char[] ch = null;
        int len = 0;
        boolean flag = Boolean.TRUE;

        for (String s : str)
        {
            System.out.println(s);
            ch = s.toUpperCase().toCharArray();
            len = ch.length-1;
            flag = Boolean.TRUE;

            for (int i=0; i<=len; i++)
            {
                if (ch[i] != ch[len])
                {
                    flag = Boolean.FALSE;
                    break;
                }
                len--;
            }

            if (flag==Boolean.TRUE)
            {
                sb.append(s + ", ");
            }
        }

        return sb.toString();
    }

    void printPalindrome()
    {
        System.out.println("Palindrome Strings = " + findPalindrome());
    }

    public static void main(String[] args)
    {
        PalindromeString ps = new PalindromeString();
        ps.printPalindrome();
    }
}
