package com.ice.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2020, 11, 4,
                15, 0, 0 );
        LocalDateTime leave = LocalDateTime.of(2020, 11, 4,
                17, 0 ,0 );

        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long)Math.ceil(car.getDuration()/60.0);
        System.out.println(hours);
//        java8();
//        java();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //Local
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH：mm：ss");
        System.out.println(formatter.format(now));
        System.out.println(formatter.format(now.plus(Duration.ofHours(3))));
        LocalDateTime other = LocalDateTime.of(2020, 11, 4, 13, 00);
        System.out.println(other);
        System.out.println(formatter.format(other.plus(Duration.ofHours(3))));
    }

    private static void java() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH：mm：ss");
        System.out.println(sdf.format(date));
        String s = "2020/11/13 08：00：00";
        Date other = null;
        try {
            other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 9);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }
}
