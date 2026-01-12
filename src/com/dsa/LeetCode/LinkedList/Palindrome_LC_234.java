package com.dsa.LeetCode.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Palindrome_LC_234
{
    ListNode head;

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

    boolean isPalindromeList()
    {
        ListNode trav = head;
        List<Integer> list = new ArrayList<>();

        while (trav != null)
        {
            list.add(trav.val);
            System.out.print(trav.val + " -> ");
            trav = trav.next;
        }
        System.out.println();

        int left = 0, right = list.size() - 1;
        while (left < right)
        {
            if (list.get(left) != list.get(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Find Palindrome by reversing the LL from Middle
    boolean isPalindrome()
    {
        ListNode slow = head, fast = head;

        while (fast!=null && fast.next!=null)
        {
            //System.out.println(slow.val + " and " + fast.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        slow = reversLL(slow);
        fast = head;
        //System.out.println(fast.val + " and " + slow.val);

        while (slow!=null)
        {
            if (fast.val!=slow.val)
            {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args)
    {
        Palindrome_LC_234 pal = new Palindrome_LC_234();

        pal.head = new ListNode(15);
        pal.head.next = new ListNode(25);
        pal.head.next.next = new ListNode(30);
        pal.head.next.next.next = new ListNode(25);
        pal.head.next.next.next.next = new ListNode(15);

        System.out.println("Palindrome = " + pal.isPalindromeList());
        System.out.println("Palindrome = " + pal.isPalindrome());
    }
}
