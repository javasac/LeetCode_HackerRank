package com.dsa.CodeSignal;
import java.util.Stack;

public class Valid_Parenthesis_LC_20
{
    boolean checkParenthesis(String str)
    {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray())
        {
            if ('(' == ch)
            {
                st.push(')');
            }
            else if ('{' == ch)
            {
                st.push('}');
            }
            else if ('[' == ch)
            {
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != ch)
            {
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args)
    {
        Valid_Parenthesis_LC_20 vp = new Valid_Parenthesis_LC_20();

        System.out.println("Valid Parenthesis = " + vp.checkParenthesis("[()[()]{}]"));
    }
}
