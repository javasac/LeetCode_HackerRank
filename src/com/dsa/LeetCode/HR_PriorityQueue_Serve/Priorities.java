package com.dsa.LeetCode.HR_PriorityQueue_Serve;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Priorities
{
    PriorityQueue<Student> pq = new PriorityQueue<Student>((s1, s2) -> Double.compare(s2.getCgpa(), s1.getCgpa()));

    ArrayList<Student> getStudents(List<String> events)
    {
        int n = events.size();
        String[] s = new String[4];

        for (String i : events)
        {
            s = i.split("\\ss");

            if (s.length > 1)
            {
                pq.add(new Student(s[1], Double.valueOf(s[2]), Integer.valueOf(s[3])));
            }
            /*else
            {
                pq.poll();
            }*/
        }

        while (pq.size() > 1)
        {
            System.out.println(pq.poll().getName());
        }

        return new ArrayList<Student>(pq);
    }
}
