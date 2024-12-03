package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class subtractProductAndSum {
    public static void callSubtractProductAndSum() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        System.out.println("Difference between product and integer : "+subtractProductAndSum(n));
    }
    public static int subtractProductAndSum(int n) {
        int difference;
        int product = 1;
        int sum = 0;


        while (n> 0) {
            int dig = n % 10;
            product *= dig;
            sum += dig;
            n /= 10;
        }
        difference = product - sum;

        return difference;
    }
}
