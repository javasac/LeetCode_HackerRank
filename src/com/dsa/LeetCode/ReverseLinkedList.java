package com.dsa.LeetCode;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList
{
    void reverseStack(LinkedList<Integer> ll)
    {
        Iterator<Integer> it = ll.iterator();
        Stack<Integer> st = new Stack<>();
        int ctr = 0;

        System.out.println("======Original List=====");
        this.printLinkedList(ll);

        while (it.hasNext())
        {
            ctr = it.next();
            st.push(ctr);
        }
        System.out.println("Size of Stack is " + st.size());
        ll = new LinkedList<>();

        while (!st.isEmpty())
        {
            ctr = st.pop();
            System.out.print(ctr + ", ");
            ll.add(ctr);
        }
        System.out.println();

        System.out.println("======Reversed List=====");
        this.printLinkedList(ll);
    }

    void printLinkedList(LinkedList<Integer> ll)
    {
        Iterator<Integer> it = ll.iterator();
        int x = 0;

        while (it.hasNext())
        {
            x = it.next();
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    // main method
    public static void main(String[] args)
    {
        ReverseLinkedList rl = new ReverseLinkedList();
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(10);
        ll.add(20);
        ll.add(30);

        rl.reverseStack(ll);
    }
}
