package com.dsa.LeetCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class IceCream_2Friends
{
    int target = 10;
    List<Integer> rates = new ArrayList<>();

    IceCream_2Friends()
    {
        rates.add(3);
        rates.add(83);
        rates.add(9);
        rates.add(17);
        rates.add(6);
        rates.add(2);
    }

    List<Integer> IceCreams()
    {
        rates.sort(null);
        List<Integer> cost = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int diff = 0;

        for (int i=0; i<rates.size(); i++)
        {
            diff = target - rates.get(i);
            map.put(rates.get(i), i);

            if (map.containsKey(diff))
            {
                cost.add(diff);
                cost.add(rates.get(i));
                return cost;
            }
        }
        cost.add(0);
        return cost;
    }

    public static void main(String[] args)
    {
        IceCream_2Friends ic = new IceCream_2Friends();

        List<Integer> cost  = ic.IceCreams();

        for (int i : cost)
        {
            System.out.print(i + ", ");
        }
    }
}
