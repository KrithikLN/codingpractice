package org.example;

import java.util.Scanner;

public class toLowerCase {
    public static void calltoLowerCase() {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        System.out.println("Lowercase String "+s.toLowerCase());
    }
    public static String toLowerCase(String s) {
        s = s.toLowerCase();
        return s;
    }
}
