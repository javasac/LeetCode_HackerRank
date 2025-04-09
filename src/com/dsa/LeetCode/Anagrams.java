package com.dsa.LeetCode;
import java.util.Arrays;

// Find if 2 Strings are equal.
class Anagrams
{
    String a = "ehlloj";
    String b = "heljlo";

    void sortStrings()
    {
        char[] chars = a.toCharArray();
        Arrays.sort(chars);
        String aa = new String(chars).toUpperCase();

        chars = b.toCharArray();
        Arrays.sort(chars);
        String bb = new String(chars).toUpperCase();

        System.out.println(aa + " = " + bb);

        if (aa.equals(bb))
        {
            System.out.println("Both Strings are equal.");
        }
        else
        {
            System.out.println("Strings are not equal.");
        }
    }

    public static void main(String[] args)
    {
        Anagrams ag = new Anagrams();
        ag.sortStrings();
    }
}
