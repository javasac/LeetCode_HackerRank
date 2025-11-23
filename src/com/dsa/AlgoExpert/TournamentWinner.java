package com.dsa.AlgoExpert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TournamentWinner
{
    public String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results)
    {
        ArrayList<String> arr = new ArrayList<>();
        int res = 0;
        TreeMap<String, Integer> map = new TreeMap<>();

        for (int i=0; i<competitions.size(); i++)
        {
            arr = competitions.get(i);
            res = results.get(i);
            System.out.println(arr.getFirst() + " and " + arr.getLast() + ".");

            if (res == 0)
            {
                map.compute(arr.getLast(), (k, v) -> v == null ? 3 : v + 3);
                System.out.println(arr.getLast() + " is a winner.");
            }
            else
            {
                map.compute(arr.getFirst(), (k, v) -> v == null ? 3 : v + 3);
                System.out.println(arr.getFirst() + " is a winner.");
            }
            System.out.println();
        }
        System.out.println(map);

        Map.Entry<String, Integer> max = null;
        for (Map.Entry<String, Integer> m : map.entrySet())
        {
            if (max == null || m.getValue() > max.getValue())
            {
                max = m;
            }
        }
        System.out.println("Winner is " + max.getKey() + " with points = " + max.getValue());

        return max.getKey();
    }

    public static void main(String[] args)
    {
        TournamentWinner tw = new TournamentWinner();

        ArrayList<ArrayList<String>> comp = new ArrayList<ArrayList<String>>();
        comp.add(new ArrayList<>(Arrays.asList("HTML", "C#")));
        comp.add(new ArrayList<>(Arrays.asList("C#", "Python")));
        comp.add(new ArrayList<>(Arrays.asList("Python", "HTML")));

        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(0, 0, 1));

        System.out.println("Winner is " + tw.tournamentWinner(comp, res));
    }
}
