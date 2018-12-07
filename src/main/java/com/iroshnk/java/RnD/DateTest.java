package com.iroshnk.java.RnD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);


        DateFormat formatterUTC = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz yyyy");
        formatterUTC.setTimeZone(TimeZone.getTimeZone("UTC")); // UTC timezone
        System.out.println(formatterUTC.format(date));
    }
}
