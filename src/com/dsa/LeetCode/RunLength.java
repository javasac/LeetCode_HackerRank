package com.dsa.LeetCode;
import java.util.HashMap;
import java.util.Map;

public class RunLength
{
    void countChars(String str)
    {
        HashMap<String, Integer> hm = new HashMap<>();
        int ctr = 0;
        String ch1;

        for (char c : str.toCharArray())
        {
            ch1 = String.valueOf(c);

           if (hm.containsKey(ch1))
           {
               ctr = hm.get(ch1);
               ctr = ctr + 1;
               hm.replace(ch1, ctr);
           }
           else
           {
               hm.put(ch1, 1);
           }
        }

        StringBuffer finalStr = new StringBuffer();
        for (Map.Entry<String, Integer> entry : hm.entrySet())
        {
            System.out.println("Key = " + entry.getKey() + " and Value is " + entry.getValue());
            finalStr.append(entry.getKey());
            finalStr.append(entry.getValue());
        }
        System.out.println("Final String is " + finalStr);
    }

    public static void main(String[] args)
    {
        RunLength rl = new RunLength();
        String str = "AABBBCAADDCD";
        rl.countChars(str);
    }
}
