package com.dsa.CodeSignal;
import java.util.Arrays;

public class Valid_Anagram_LC_242
{
    boolean validAnagram(String a, String b)
    {
        if (a.length() != b.length())
        {
            return false;
        }

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        Arrays.sort(aa);
        Arrays.sort(bb);

        String one = new String(aa);
        String two = new String(bb);

        System.out.println(one + " = " + two);

        if (one.equals(two))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean anagramCheck(String a, String b)
    {
        a = a.toLowerCase();
        b = b.toLowerCase();

        a = a.replace(" ", "");
        b = b.replace(" ", "");

        int[] counts = new int[26];

        for (int i = 0; i < a.length(); i++)
        {
            counts[a.charAt(i) - 'a']++;
        }
        Arrays.stream(counts).forEach(c -> System.out.print(c + ", "));

        for (int i = 0; i < b.length(); i++)
        {
            counts[b.charAt(i) - 'a']--;
        }
        System.out.println();
        Arrays.stream(counts).forEach(c -> System.out.print(c + ", "));

        for (int c : counts)
        {
            if (c != 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args)
    {
        Valid_Anagram_LC_242 va = new Valid_Anagram_LC_242();

        va.anagramCheck("rate", "cate");

        //System.out.println("Valid Anagram = " + va.validAnagram("anagram", "nagaram"));
    }
}
