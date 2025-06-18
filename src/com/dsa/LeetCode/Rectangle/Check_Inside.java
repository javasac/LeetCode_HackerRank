package com.dsa.LeetCode.Rectangle;

public class Check_Inside
{
    boolean checkInside(Rectangle r1, Rectangle r2)
    {
        Origin o1 = r1.getOrigin();
        int x1 = o1.getX();
        int y1 = o1.getY();
        int a1 = x1 + r1.getWidth();
        int b1 = y1 - r1.getHeight();

        Origin o2 = r2.getOrigin();
        int x2 = o2.getX();
        int y2 = o2.getY();
        int a2 = x2 + r2.getWidth();
        int b2 = y2 - r2.getHeight();

        System.out.println("Rectangle 1 Co-Ordinates");
        System.out.println("(" + x1 + ", " + y1 + ") and " + "(" + a1 + ", " + b1 + ")");

        System.out.println("Rectangle 2 Co-Ordinates");
        System.out.println("(" + x2 + ", " + y2 + ") and " + "(" + a2 + ", " + b2 + ")");

        if ((x2 > x1) && (y1 > y2) && (a1 > a2) && (b2 > b1))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4, 4, 1, 5);
        Rectangle r2 = new Rectangle(1, 1, 2, 4);
        Check_Inside ci = new Check_Inside();

        System.out.println("R2 inside R1 is " + ci.checkInside(r1, r2));
    }
}
