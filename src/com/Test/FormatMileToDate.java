package com.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将毫秒数转换为date
 *
 * @author ：Axel
 * @since ：2020/6/12 18:48
 */
public class FormatMileToDate {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        date.setTime(currentTimeMillis);
        System.out.println(simpleDateFormat.format(date));

    }
}
