package com.dsa.AlgoExpert.LinkedList;

public class LinkedList
{
    private int value;
    private LinkedList next;

    LinkedList(int val)
    {
        this.value = val;
        this.next = null;
    }

    LinkedList(int val, LinkedList next)
    {
        this.value = val;
        this.next = next;
    }

    int getValue()
    {
        return this.value;
    }

    void setValue(int val)
    {
        this.value = val;
    }

    LinkedList getNext()
    {
        return this.next;
    }

    void setNext(LinkedList ll)
    {
        this.next = ll;
    }
}
