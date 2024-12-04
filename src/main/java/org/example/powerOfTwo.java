package org.example;

import java.util.Scanner;

public class powerOfTwo {
    public static void callpowerOfTwo() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        if(powerOfTwo(n) == true)
        {
            System.out.println("Number is a power of two");
        }else {
            System.out.println("Number is not a power of two");
        }

    }
    public static boolean powerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;

    }
}
