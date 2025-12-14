package com.dsa.AlgoExpert.LinkedList;

public class LLTraversal
{
    LinkedList head;

    LLTraversal()
    {
        LinkedList fir = new LinkedList(10);
        LinkedList sec = new LinkedList(20);
        LinkedList thi = new LinkedList(30);
        LinkedList fou = new LinkedList(40);

        head = fir;
        fir.setNext(sec);
        sec.setNext(thi);
        thi.setNext(fou);
    }

    void printLL(LinkedList ll)
    {
        while (ll != null)
        {
            System.out.println("Value is " + ll.getValue());
            ll = ll.getNext();
        }
    }

    LinkedList reverseLL(LinkedList ll)
    {
        LinkedList prev = null, curr = ll, next = null;

        while (curr != null)
        {
            next = curr.getNext();
            curr.setNext(prev);

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        LLTraversal ll = new LLTraversal();

        ll.printLL(ll.head);
        ll.head = ll.reverseLL(ll.head);

        System.out.println("=====Reversed List=====");
        ll.printLL(ll.head);
    }
}
