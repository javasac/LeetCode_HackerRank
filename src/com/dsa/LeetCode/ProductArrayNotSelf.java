package com.dsa.LeetCode;

public class ProductArrayNotSelf
{
    void product(int arr[])
    {
        int product = 1;
        int prodArr[] = new int[arr.length];

        for (int i=0; i<arr.length; i++)
        {
            product = product * arr[i];
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println("Product is " + product);

        for (int i=0; i<arr.length; i++)
        {
            prodArr[i] = product / arr[i];
            System.out.print(prodArr[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ProductArrayNotSelf pa = new ProductArrayNotSelf();
        int arr[] = {1, 2, 3, 4};
         pa.product(arr);
    }
}
