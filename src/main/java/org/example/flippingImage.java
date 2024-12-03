package org.example;

import java.util.Arrays;

public class flippingImage {
    public static void callflippingImage() {
        int[][] digits = {{1, 1, 0}, {0, 1, 0}};
        System.out.println(Arrays.deepToString(flippingImage(digits)));
    }

    public static int[][] flippingImage(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < (rows + 1) / 2; ++j) {
                final int temp= image[i][j];
                image[i][j] = image[i][rows - j - 1] ^ 1;
                image[i][rows - j - 1] = temp ^ 1;
            }

        return image;
    }
}
