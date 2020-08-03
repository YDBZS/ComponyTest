package com.Test.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Lambda表达式流操作
 *
 * @author ：Axel
 * @since ：2020/6/12 19:01
 */
public class LambdaStream {
    public static void main(String[] args) {
        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
        for (String proName : proNames) {
            System.out.println(proName);
        }
        System.out.println("------------------分割线------------------------------------");
        System.out.println("------------------分割线------------------------------------");
        System.out.println("------------------分割线------------------------------------");
        System.out.println("------------------分割线------------------------------------");
        System.out.println("------------------分割线------------------------------------");
        List<String> collect = proNames.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }


    }
}
