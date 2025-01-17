package com.dsa.LeetCode;
import java.util.LinkedList;

public class QueueUsingLinkedList<T>
{
    private LinkedList<T> list;

    public QueueUsingLinkedList()
    {
        list = new LinkedList<>();
    }

    public void enqueue(T element)
    {
        list.addLast(element);
    }

    public T dequeue()
    {
        if (list.isEmpty())
        {
            throw new IllegalArgumentException();
        }
        return list.removeLast();
    }

    public T peek()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    public int size()
    {
        return list.size();
    }

    public static void main(String[] args)
    {
        QueueUsingLinkedList<Integer> myQueue = new QueueUsingLinkedList<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("Size: " + myQueue.size()); // Output: 3
        System.out.println("Peek: " + myQueue.peek()); // Output: 1
        System.out.println("Dequeue: " + myQueue.dequeue()); // Output: 1
        System.out.println("Size: " + myQueue.size()); // Output: 2
    }
}
