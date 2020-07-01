package com.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 线程类
 *
 * @author ：Axel
 * @since ：2020/6/11 12:10
 */
public class thread {
    public static void main(String[] args) {
        new Thread(() -> {
            
        }).start();
    }


    public long AListTets(){
        List<Long> alist = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (long i = 0; i < 9000000000000000000l; i++){
            alist.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public long LListTests(){
        List<Long> llist = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (long i = 0; i < 9000000000000000000l; i++){
            llist.add(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}
