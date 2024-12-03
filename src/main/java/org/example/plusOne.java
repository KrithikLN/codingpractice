package org.example;

public class plusOne {
    public static void callPlusOne() {
        int[] digits = {1, 2, 3};
        System.out.println("Input : " + java.util.Arrays.toString(digits)+"\n Output : "+java.util.Arrays.toString(plusOne(digits)));
        digits = new int[]{4, 3, 2, 1};
        System.out.println("Input : " + java.util.Arrays.toString(digits)+"\n Output : "+java.util.Arrays.toString(plusOne(digits)));
        digits = new int[]{9};
        System.out.println("Input : " + java.util.Arrays.toString(digits)+"\n Output : "+java.util.Arrays.toString(plusOne(digits)));
        digits = new int[]{ 1, 2,9};
        System.out.println("Input : " + java.util.Arrays.toString(digits)+"\n Output : "+java.util.Arrays.toString(plusOne(digits)));

    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        // Takes the array values from digits automatically
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}

