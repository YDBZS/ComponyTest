package com.Test.Test;

import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author ：Axel
 * @since ：2020/6/12 12:21
 */
public class LongTest {
    public static void main(String[] args) {
        final LocalDateTime fromDate = LocalDateTime.now();
        final LocalDateTime toDate = LocalDateTime.now().plusHours(56);

        final Duration duration = Duration.between(fromDate, toDate);

        final long minuts = duration.toMinutes();
        final long hours = duration.toHours();

        System.out.println(minuts);
        System.out.println(hours);


    }
}
