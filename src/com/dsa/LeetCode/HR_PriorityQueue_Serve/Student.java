package com.dsa.LeetCode.HR_PriorityQueue_Serve;

class Student
{
    private int id;
    private String name;
    private double cgpa;

    Student(String name, double cgpa, int id)
    {
        this.name = name;
        this.cgpa = cgpa;
        this.id= id;
    }

    int getID()
    {
        return this.id;
    }

    String getName()
    {
        return this.name;
    }

    double getCgpa()
    {
        return this.cgpa;
    }
}

