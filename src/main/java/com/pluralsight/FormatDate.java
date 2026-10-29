package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter american = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(american));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(format2));

        System.out.printf("%s, %s %s, %s", now.getDayOfWeek(), now.getMonth(), now.getDayOfMonth(), now.getYear());

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEEE, MMM dd, yyyy   hh:mm");
        System.out.printf("\n%s, %s %s, %s   %s:%s\n", now.getDayOfWeek(), now.getMonth(), now.getDayOfMonth(), now.getYear(), now.getHour(), now.getMinute());
        System.out.println(now.format(format3));

        System.out.println();
    }
}
