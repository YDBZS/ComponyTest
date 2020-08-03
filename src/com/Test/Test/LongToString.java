package com.Test.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 测试Long类型转换String类型会不会精度丢失
 *
 * @author ：Axel
 * @since ：2020/6/12 18:36
 */
public class LongToString {
    public static void main(String[] args) {
        TestBO testBO = new TestBO();
        testBO.setLongVal(System.currentTimeMillis());
        testBO.setStringval(String.valueOf(System.currentTimeMillis()));
        System.out.println(testBO);
        System.out.println(LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()));
    }



}
