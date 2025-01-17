package com.dsa.LeetCode;
import java.util.HashMap;

public class CountChars
{
    public static void main(String args[])
    {
        String str = "Java is good programming language";
        int ctr = 1;

        java.util.Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(str);

        for (char c : str.toCharArray())
        {
            if (map.containsKey(c))
            {
                ctr = map.get(c);
                map.replace(c, ctr + 1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        // Java 1.8 features
        map.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
    }
}
