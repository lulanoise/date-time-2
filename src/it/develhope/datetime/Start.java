package it.develhope.datetime;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Start {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        System.out.println(now.getDayOfMonth()
                + " " + now.getMonth()
                + " " + now.getYear() % 100
                + " " + now.getHour()
                + " " + now.getMinute());

        ZonedDateTime now1 = ZonedDateTime.now();
        System.out.println(now1);

    }
}

