package com.Test.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * List两个实现类对比
 *
 * @author ：Axel
 * @since  ：2020/6/11 12:01
 */
public class ListCompare {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        List<String> Alist = new ArrayList<>();
        for (long i = 0; i < 5000000000000000000L; i++) {
            Alist.add(String.valueOf(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList添加两百个字符串用时间："+ (end - start) +" 毫秒");

    }
}
