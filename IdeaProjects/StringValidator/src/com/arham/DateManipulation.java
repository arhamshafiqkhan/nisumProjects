package com.arham;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Current Date: " + date);

        LocalDateTime futureDate = date.plusMonths(1);
        System.out.println("Future Date: " + futureDate);

        LocalDateTime pastDate = date.minusDays(15);
        System.out.println("Past Date: " + pastDate);

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("E, MMM dd HH:mm:ss yyyy");
        String formattedDate1 = date.format(format1);
        System.out.println(formattedDate1);

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy MMM dd HH:mm:ss");
        String formattedDate2 = date.format(format2);
        System.out.println(formattedDate2);
    }
}
