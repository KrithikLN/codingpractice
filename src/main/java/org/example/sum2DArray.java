package org.example;

public class sum2DArray {
    public static void callSum2DArray() {
        int twoDarray[][] = {{1, 2, 3},{4, 5, 6}};
        System.out.println("Sum of 2D Array : " + sum2DArray(twoDarray));

    }
    public static int sum2DArray(int[][] matrix) {
        int sum = 0;
        if (matrix == null) {
            return sum;
        }

        int rows = matrix.length;
        for(int i = 0; i < rows; i++) {
            int cols = matrix[i].length;
            for(int j = 0; j < cols; j++) {
                sum+= matrix[i][j];
            }
        }
        return sum;
    }
}
