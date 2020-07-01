package com.yeahzee.test;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;


/**
 * 包装类型是否为空判断
 * <p>TODO</p>
 *
 * @author 多宝
 * @since 2020/7/1 16:49
 */
public class IsPackingTest {
    public static void main(String[] args) {

        Test1();


    }


    public static void Test1(){
        String str = " ";

        System.out.println(StringUtils.isEmpty(str));       //false

        System.out.println(StringUtils.isNotEmpty(str));     //true

        System.out.println(Objects.nonNull(str));            //true

        System.out.println(Objects.isNull(str));            //false

        System.out.println(StringUtils.isBlank(str));       //true

        System.out.println(StringUtils.isNotBlank(str));    //false
    }

}
