package com.thecodewar.java;

import java.time.*;

import java.time.temporal.ChronoUnit;

public class DateAPIExample {

    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println(currentTime);
        System.out.println(currentTime.getMonth());
        testPeriod();
        testDuration();
    }

    public static void testPeriod() {
        //Get the current date
        LocalDate date1 = LocalDate.now();
        System.out.println("Current date: " + date1);
        //add 1 month to the current date
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        System.out.println("Next month: " + date2);
        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);
    }

    public static void testDuration() {
        LocalTime time1 = LocalTime.now();
        Duration twoHours = Duration.ofHours(29);
        LocalTime time2 = time1.plus(twoHours);
        Duration duration = Duration.between(time1, time2);
        System.out.println("Duration: " + duration);
    }

}
