package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(formatter.format(today));
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(formatter.format(today));
        String dayOfTheWeek = today.getDayOfWeek().toString();
        int dayOfTheMonth = today.getDayOfMonth();
        int year = today.getYear();
        System.out.println(dayOfTheWeek + ", " + dayOfTheMonth + ", " + year);
        LocalDateTime now = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("E, MMM d, yyyy HH:mm");
        System.out.println(now.format(formatter));

    }
}
