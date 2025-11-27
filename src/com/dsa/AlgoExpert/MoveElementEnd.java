package com.dsa.AlgoExpert;
import java.util.Arrays;
import java.util.List;

public class MoveElementEnd
{
    public List<Integer> moveElementToEnd(List<Integer> array, int toMove)
    {
        int pos = 0;

        array.stream().forEach(a -> System.out.print(a + ", "));
        System.out.println();

        for (int i=0; i<array.size(); i++)
        {
            if (array.get(i) != toMove)
            {
                array.set(pos, array.get(i));
                pos++;
            }
        }

        while (pos < array.size())
        {
            array.set(pos, toMove);
            pos++;
        }

        array.stream().forEach(a -> System.out.print(a + ", "));
        return array;
    }

    public static void main(String[] args)
    {
        MoveElementEnd me = new MoveElementEnd();

        List<Integer> li = Arrays.asList(0, 1, 0, 2, 0, 3, 4, 2);
        int toMove = 0;

        me.moveElementToEnd(li, toMove);
    }
}
