package com.arham;

import java.time.Instant;

public class secondsSince1970 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println("Current instant: " + instant);

        long epochValue = instant.getEpochSecond(); //return seconds since 1970

        System.out.println("Seconds since 1970 are: " + epochValue);
        System.out.println("Milliseconds since 1970 are: " + epochValue * 1000);
    }
}
