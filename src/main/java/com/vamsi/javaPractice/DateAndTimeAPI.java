package com.vamsi.javaPractice;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        Date d=new Date ();
        System.out.println (d);
        LocalDateTime dateTime=LocalDateTime.now ();
        System.out.println ("dateTime "+dateTime);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern ("yyyy-mm-dd HH:mm:ss");
        LocalDateTime parse = LocalDateTime.parse ("2024-10-02 00:00:00.0", dateTimeFormatter);
        System.out.println ("parse  "+parse.toLocalDate ());
        ZonedDateTime zonedDateTime=ZonedDateTime.now ();
        System.out.println (zonedDateTime);
        System.out.println (OffsetTime.now ());
        DateTimeFormatter dateTimeFormatter1=  DateTimeFormatter.ofPattern ("MM-dd-YYY kk:mm:ss");
        String format = dateTimeFormatter.format (dateTime);
        System.out.println (format);
        Instant now = Instant.now();
        ZoneId zoneId = ZoneId.of("Europe/Istanbul");
        LocalDateTime dateAndTimeInLA = LocalDateTime.ofInstant(now, zoneId);
        System.out.println (dateAndTimeInLA);

    }

}
