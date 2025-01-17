package com.dsa.LeetCode;

public class ReverseString
{
    public static void main(String args[])
    {
        String str = "I love coding in Java";
        String rev = "";

        //Breaking the sentence into words
        String s[] = str.split(" ");

        //Adding the words stored in the array to the last
        for (int j=0; j<s.length; j++)
        {
            rev = s[j] + " " + rev;
        }

        System.out.println("Reversed sentence: " + rev);
    }
}
