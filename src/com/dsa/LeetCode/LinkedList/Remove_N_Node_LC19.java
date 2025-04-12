package com.dsa.LeetCode.LinkedList;
// Remove Nth node from last. LeetCode Medium 19.

public class Remove_N_Node_LC19
{
    ListNode head;

    void printLLCount()
    {
        ListNode temp = head;
        int len = 0;

        while (temp.next!=null)
        {
            System.out.println(temp.val);
            temp = temp.next;
            len++;
        }

        len++;
        System.out.println(temp.val);
        System.out.println("Length of LL is " + len);
    }

    ListNode removeNode(ListNode head, int n)
    {
        ListNode curr = head;
        int len = 0;

        while (curr!=null)
        {
            len++;
            curr = curr.next;
        }

        curr = head;

        for (int i=0; i<len-n-1; i++)
        {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return head;
    }

    public static void main(String[] args)
    {
        Remove_N_Node_LC19 rl = new Remove_N_Node_LC19();

        rl.head = new ListNode(10);
        rl.head.next = new ListNode(20);
        rl.head.next.next = new ListNode(30);
        rl.head.next.next.next = new ListNode(40);
        rl.head.next.next.next.next = new ListNode(50);

        rl.printLLCount();
        rl.head = rl.removeNode(rl.head, 2);
        rl.printLLCount();
    }
}
