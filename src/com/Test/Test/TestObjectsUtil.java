package com.Test.Test;

import java.util.*;

/**
 * 测试Objects 工具类
 * <p>
 *     1.测试包装类
 *
 *     2.测试集合
 *
 *     3.测试对象
 *
 * </p>
 *
 * @author 多宝
 * @since 2020/7/3 11:55
 */
public class TestObjectsUtil {
    public static void main(String[] args) {
        Object[] intarr = {1, null};

        Random random = new Random();

        //1.测试包装类型
        //Integer integer = random.nextInt((Integer) intarr[intarr.length - 1]);
        //TestPacking(integer);

        //2.测试集合类
        List<Integer> intList = new ArrayList<>();
        TestPacking(intList);

        TestPacking(new User());





    }


    /**
     * 测试包装类型
     *
     * @author 多宝
     * @since 2020/7/3 11:58
     * @param p   任意类型参数
     * */
    public static <P> void TestPacking(P p){
        if (Objects.isNull(p)){
            System.out.println("此对象为空");
        }

        if (Objects.nonNull(p)){
            System.out.println("此对象不为空");
        }
    }

}
