package com.dsa.LeetCode;
import java.util.*;

public class HighFiveNames
{
    void findAvg(List ls)
    {
        ls.stream().forEach(System.out::println);

        Scores s = new Scores();
        int score = 0;
        HashMap sco = new HashMap();
        HashMap avg = new HashMap();

        for (int i=0; i<ls.size(); i++)
        {
            s = (Scores)ls.get(i);

            if (sco.containsKey(s.getName())==false)
            {
                sco.put(s.getName(), s.getScore());
                avg.put(s.getName(), 1);
            }
            else
            {
                score = (int)sco.get(s.getName());
                score = score + s.getScore();
                sco.replace(s.getName(), String.valueOf(score));

                score = (int)avg.get(s.getName());
                score = score + 1;
                avg.replace(s.getName(), String.valueOf(score));
            }
        }

        System.out.println(sco);
        System.out.println(avg);
        System.out.println("=======Printing the Final Average score of each======");

        HashMap hmp = new HashMap();
        int nume = 0;
        int deno = 0;

        for (Object key : sco.keySet())
        {
            nume = Integer.parseInt(sco.get(key).toString());
            deno = Integer.parseInt(avg.get(key).toString());
            score = nume / deno;

            System.out.println(key + " : " + score);
            hmp.put(key, score);
        }
    }

    public static void main(String[] args)
    {
        HighFiveNames hf = new HighFiveNames();
        List l = hf.Scores();
        hf.findAvg(l);
    }

    private List Scores()
    {
        List<Scores> sco = new ArrayList<>();

        Scores s1 = new Scores("Sachin", 100);
        sco.add(s1);

        Scores s2 = new Scores("Nitin", 80);
        sco.add(s2);

        Scores s3 = new Scores("Nidhi", 95);
        sco.add(s3);

        Scores s4 = new Scores("Sachin", 88);
        sco.add(s4);

        Scores s5 = new Scores("Nitin", 60);
        sco.add(s5);

        Scores s6 = new Scores("Nidhi", 90);
        sco.add(s6);

        Scores s7 = new Scores("Anchal", 66);
        sco.add(s7);

        return sco;
    }
}
