package org.example;

import java.util.Scanner;

public class dayOftheweek {
    public static void calcDayofWeek() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Day");
        int day = sc.nextInt();
        System.out.println("Month");
        int month = sc.nextInt();
        System.out.println("Year");
        int year = sc.nextInt();
        int lasttwodigits = year % 100;
        System.out.println(lasttwodigits);
        int yearcode = year/4;
        int monthcode;
        if (month == 1 && month/4!=0) {
            monthcode = 0;
        } else if (month == 1 && month/4==0) {
            monthcode = 6;
        } else if (month == 2 && month/4!=0) {
            monthcode = 3;
        } else if (month == 2 && month/4==0) {
            monthcode = 2;
        } else if (month == 3 && month/4!=0) {
            monthcode = 3;
        } else if (month == 3) {
            monthcode = 3;
        } else if (month == 4) {
            monthcode = 6;
        } else if (month == 5) {
            monthcode = 1;
        } else if (month == 6) {
            monthcode = 4;
        } else if (month == 7) {
            monthcode = 6;
        } else if (month == 8) {
            monthcode = 2;
        } else if (month == 9) {
            monthcode = 5;
        } else if (month == 10) {
            monthcode = 0;
        } else if (month == 11) {
            monthcode = 3;
        } else if (month == 12) {
            monthcode = 5;
        } else {
            System.out.println("Invalid month");
        }


        int centurycode;
        if (year>=1900 && year<2000) {
            centurycode = 0;
        } else if (year>=2000 && year<2100) {
            centurycode = 6;
        } else if (year>=2100 && year<2200) {
            centurycode = 4;
        } else {
            System.out.println("Invalid year");
        }
    }
}
