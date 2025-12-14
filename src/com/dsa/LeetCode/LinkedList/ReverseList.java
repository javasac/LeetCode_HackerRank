package com.dsa.LeetCode.LinkedList;

public class ReverseList
{
    ListNode head;

    void printNodes(ListNode node)
    {
        System.out.println();
        while (node != null)
        {
            System.out.print(" " + node.val);
            node = node.next;
        }
    }

    // reverse linked list
    ListNode reversLL(ListNode node)
    {
        ListNode curr = node, prev = null, next = null;

        while (curr!=null)
        {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args)
    {
        ReverseList rl = new ReverseList();

        rl.head = new ListNode(1);
        rl.head.next = new ListNode(2);
        rl.head.next.next = new ListNode(3);
        rl.head.next.next.next = new ListNode(4);
        rl.head.next.next.next.next = new ListNode(5);

        rl.printNodes(rl.head);
        ListNode rev = rl.reversLL(rl.head);
        rl.printNodes(rev);
    }
}
