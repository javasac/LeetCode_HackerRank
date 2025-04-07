package com.dsa.LeetCode.BitManipulation;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;      // Binary: 0101
        int b = 3;      // Binary: 0011

        System.out.println("a & b: " + (a & b));    // Output: 1 (0001)
        System.out.println("a | b: " + (a | b));    // Output: 7 (0111)
        System.out.println("a ^ b: " + (a ^ b));    // Output: 6 (0110)
        System.out.println("~a: " + (~a));        // Output: -6 (11111010 in two's complement)
        System.out.println("a << 1: " + (a << 1));

        b = a << 2;       /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + b);

        b = a >> 2;       /* 15 = 1111 */
        System.out.println("a >> 2  = " + b);

        b = a >>> 2;      /* 15 = 0000 1111 */
        System.out.println("a >>> 2 = " + b);
    }
}


