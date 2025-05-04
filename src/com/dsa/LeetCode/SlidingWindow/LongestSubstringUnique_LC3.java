package com.dsa.LeetCode.SlidingWindow;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubstringUnique_LC3
{
    int CountUnique(String str)
    {
        Set<Character> set = new LinkedHashSet<>();
        int left = 0, max = 0, len = 0;
        char c;

        for (int right = 0; right < str.length(); right++)
        {
            c = str.charAt(right);

            while (set.contains(c))
            {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            len = right - left + 1;
            max = Math.max(max, len);
        }

        return max;
    }

    public static void main(String[] args)
    {
        LongestSubstringUnique_LC3 un = new LongestSubstringUnique_LC3();
        String str = "bbabcabcd";

        System.out.println("Max unique substring is " + un.CountUnique(str));
    }
}
