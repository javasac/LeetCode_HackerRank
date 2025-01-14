package com.dsa.LeetCode;

public class Scores
{
    String name;
    int score;

    public String toString()
    {
        return "Name : " + name + " and Score : " + score;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    Scores()
    {
    }

    Scores(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}
