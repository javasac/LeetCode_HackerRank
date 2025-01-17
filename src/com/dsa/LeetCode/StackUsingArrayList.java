package com.dsa.LeetCode;
import java.util.ArrayList;

public class StackUsingArrayList<T>
{
    private ArrayList<T> list;

    public StackUsingArrayList()
    {
        list = new ArrayList<>();
    }

    public void push(T item)
    {
        list.add(item);
    }

    public T pop()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public T peek()
    {
        if (isEmpty())
        {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args)
    {
        StackUsingArrayList<Integer> stack = new StackUsingArrayList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size of stack: " + stack.size());
    }
}