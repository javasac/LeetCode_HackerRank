package com.dsa.LeetCode.Rectangle;

public class Rectangle
{
    private int width;
    private int height;
    private Origin origin;

    public Rectangle(int width, int height, int x, int y)
    {
        this.width = width;
        this.height = height;
        this.origin = new Origin(x, y);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Origin getOrigin() {
        return origin;
    }

}
