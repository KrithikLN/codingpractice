package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class fizzBuzz {
    public static void fizzBuzzLoop() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for 'n' : ");
        int n = in.nextInt();

        List<String> v = new ArrayList<>();

        for(int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) {
                v.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                v.add("Fizz");
            }
            else if (i % 5 == 0) {
                v.add("Buzz");
            }
            else {
                v.add(Integer.toString(i));
            }
        }
        System.out.println(v);
    }
}
