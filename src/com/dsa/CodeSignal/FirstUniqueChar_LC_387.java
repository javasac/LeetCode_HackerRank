package com.dsa.CodeSignal;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar_LC_387
{
    int firstUnique(String str)
    {
        int ind = 0;
        char ch;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i=0; i<str.length(); i++)
        {
            ch = str.charAt(i);
            ind = map.get(ch);

            if (ind == 1)
            {
                ind = i;
                break;
            }
        }

        return ind;
    }

    public static void main(String[] args)
    {
        FirstUniqueChar_LC_387 fu = new FirstUniqueChar_LC_387();
        System.out.println("First Unique Character at " + fu.firstUnique("ZfourfourSfourd"));
    }
}
