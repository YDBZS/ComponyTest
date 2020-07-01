package com.Test.Test;

import java.util.Objects;

/**
 * 测试包装类是否为空
 * <p>TODO</p>
 *
 * @author 多宝
 * @since 2020/7/1 16:46
 */

public class TestPackingIsNull {
    public static void main(String[] args) {
        String str = "";
        System.out.println(Objects.isNull(str));
    }

}
