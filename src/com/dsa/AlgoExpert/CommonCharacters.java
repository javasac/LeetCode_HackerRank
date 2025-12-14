package com.dsa.AlgoExpert;
import java.util.*;

public class CommonCharacters
{
    void commonChar(String[] str)
    {
        Map<Character, Integer> map = new HashMap<>();
        char[] ch;

        for (String s : str)
        {
            Set<Character> set = new HashSet<>();
            ch = s.toCharArray();

            for (Character c : ch)
            {
                set.add(c);
            }
            System.out.println(set.toString());

            for (char c : set)
            {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println(map.toString());
        String res[] = new String[str.length];
        int i = 0;

        for (Map.Entry<Character, Integer> ma : map.entrySet())
        {
            System.out.println(ma.getKey() + " = " + ma.getValue());

            if (ma.getValue()==str.length)
            {
                res[i] = ma.getKey().toString();
                i++;
            }
        }

        Arrays.stream(res).forEach(System.out::println);
    }

    public static void main(String[] args)
    {
        CommonCharacters cc = new CommonCharacters();
        String[] str = {"abc", "bcd", "cbaccd"};

        cc.commonChar(str);
    }
}
