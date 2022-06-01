package com.arham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // valid string
        System.out.print("Enter a string: ");
        System.out.println(StringValidator.isValidString(input.nextLine()));

        // leap year
        System.out.print("Enter a year: ");
        System.out.println(LeapYear.isLeapYear(Integer.parseInt(input.nextLine())));

        System.out.println(LeapYear.isLeapYearOther(2004));
    }
}
