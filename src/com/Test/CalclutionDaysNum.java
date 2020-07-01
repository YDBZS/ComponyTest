package com.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * 计算两个LocalDateTime相差的天数
 *
 * @author ：Axel
 * @since ：2020/6/15 16:43
 */
public class CalclutionDaysNum {
    public static void main(String[] args) {
        long currentTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).toEpochSecond(ZoneOffset.ofHours(0));
        long l = currentTime / (60 * 60 * 24);
        long thirtyDaysLater = LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).plusDays(30L).toEpochSecond(ZoneOffset.ofHours(0));
        long l1 = thirtyDaysLater / (60 * 60 * 24);
        System.out.println(l1 - l);

    }
}
