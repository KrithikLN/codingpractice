package org.example;

import java.util.Scanner;

public class binaryOperators {
    public static void callBinaryOperator() {
        Scanner sc = new Scanner(System.in);
        int num, n;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        int choice;
        System.out.println("Enter a choise : 1 for left shift; 2 for right shift and 3 for Bitwise XOR ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter number to shift: ");
                n = sc.nextInt();
                System.out.print("Left shift : "+leftShiftBinary(num, n));
                break;
            case 2:
                System.out.print("Enter number to shift: ");
                n = sc.nextInt();
                System.out.print("Right shift : "+rightShiftBinary(num, n));
                break;
            case 3:
                System.out.print("Enter number to Bitwise XOR: ");
                int x = sc.nextInt();
                System.out.println("Bitwise XOR : "+bitwiseXOR(num, x));
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
    public static int bitwiseXOR(int a, int b) {
        int output = a ^ b;
        return output;
    }
}
