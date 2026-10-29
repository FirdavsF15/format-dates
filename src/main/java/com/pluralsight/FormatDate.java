package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDate {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter american = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(american));
    }
}
