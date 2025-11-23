package com.dsa.AlgoExpert;
// Space Complexity = O(j * i) and Time Complexity = O(i, j)

public class TransposeMatrix
{
    void transpose(int[][] mat)
    {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] trans = new int[rows][cols];

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                System.out.print(mat[i][j] + ", ");
                trans[j][i] = mat[i][j];
            }
            System.out.println();
        }

        System.out.println("Transposed Array");

        for (int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                System.out.print(trans[i][j] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        TransposeMatrix tm = new TransposeMatrix();

        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        tm.transpose(matrix);
    }
}
