package com.dsa.LeetCode;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_Demo
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap(5, .5f, true);

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.get(2);
        map.get(1);

        for (Map.Entry<Integer, String> m : map.entrySet())
        {
            System.out.println("Key = " + m.getKey() + " and Value = " + m.getValue());
        }
    }
}
