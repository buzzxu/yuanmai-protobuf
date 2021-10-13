package com.yuanmai.protobuf;

import com.google.type.DateTime;

import java.time.LocalDateTime;

/**
 * @author 徐翔
 * @since 2021-10-12 20:09
 **/
public class Dates {

    public static LocalDateTime to(DateTime dateTime){
        if(dateTime == null || dateTime == DateTime.getDefaultInstance() ){
            return null;
        }

        return LocalDateTime.of(dateTime.getYear(),dateTime.getMonth(),dateTime.getDay(), dateTime.getHours(), dateTime.getMinutes(),dateTime.getSeconds());
    }
    public static DateTime to(LocalDateTime dateTime){
        if(dateTime == null){
            return DateTime.getDefaultInstance();
        }
        return DateTime.newBuilder()
                .setYear(dateTime.getYear())
                .setMonth(dateTime.getMonthValue())
                .setDay(dateTime.getDayOfMonth())
                .setHours(dateTime.getHour())
                .setMinutes(dateTime.getMinute())
                .setSeconds(dateTime.getSecond())
                .build();
    }
}
