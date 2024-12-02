package org.example;

import java.util.Scanner;

public class binaryOperators {
    public static void callBinaryOperator() {
        Scanner sc = new Scanner(System.in);
        int num, n;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        System.out.print("Enter number to shift: ");
        n = sc.nextInt();
        int choice;
        System.out.print("Enter a choise : 1 for left shift; 2 for right shift ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Left shift : "+leftShiftBinary(num, n));
                break;
            case 2:
                System.out.print("Right shift : "+rightShiftBinary(num, n));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    public static int leftShiftBinary(int a, int b) {
        int output = a << b;
        return output;
    }
    public static int rightShiftBinary(int a, int b) {
        int output = a >> b;
        return output;
    }
}
