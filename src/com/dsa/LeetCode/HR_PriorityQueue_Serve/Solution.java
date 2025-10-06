package com.dsa.LeetCode.HR_PriorityQueue_Serve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution
{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities pri = new Priorities();

    public static void main(String[] args)
    {
        int totalEvents = Integer.parseInt(scan.nextLine());
        ArrayList<String> events = new ArrayList<>();

        while (totalEvents != 0)
        {
            String event = scan.nextLine();
            events.add(event);
            totalEvents--;
        }

        List<Student> students = pri.getStudents(events);
        if (students.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            for (Student st : students)
            {
                System.out.println(st.getName());
            }
        }
    }
}

