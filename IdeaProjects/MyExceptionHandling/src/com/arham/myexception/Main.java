package com.arham.myexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = null;

        try {
            str = input.nextLine();
            if (str.isEmpty())
                throw new StringNullException(); // This invokes the Default constructor
                //throw new StringNullException("Null string error!"); // This will invoke the parameterized constructor
            else
                System.out.println("You have entered: " + str);
        }
        catch (StringNullException e) {
            System.out.println(e.getMessage());
        }




    }
}
