package com.company.main;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateMain {
    public static void main(String[] args) {
        Date date = new Date();
        date.setTime(65651234567L);
//        System.out.println(date);

        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        String sDate = sdf.format(date);

//        System.out.println(sDate);


        Calendar calendar = Calendar.getInstance();

//        System.out.println(calendar);
        calendar.set(Calendar.YEAR, 2019);

//        calendar.


        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);


        ZonedDateTime zonedDateTime = ZonedDateTime.now();

//        now.

    }
}
