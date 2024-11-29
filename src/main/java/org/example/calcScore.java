package org.example;

import java.util.Scanner;

public class calcScore {
    public static void calculateScore() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score of student: ");
        int score = sc.nextInt();

        if (score >= 90) {
            System.out.println("Your Grade is S");
        }
        else if (score >= 80) {
            System.out.println("Your Grade is A+");
        }
        else if (score >= 70) {
            System.out.println("Your Grade is B+");
        }
        else if (score >= 60) {
            System.out.println("Your Grade is C+");
        }
        else if (score >= 50) {
            System.out.println("Your Grade is C");
        }
        else if (score >= 40) {
            System.out.println("Your Grade is F");
        }

    }
}
