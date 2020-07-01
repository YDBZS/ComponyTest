package com.Test.Test;

import com.Test.Enum.EnumYesOrNo;

/**
 * 测试枚举
 *
 * @author ：Axel
 * @since ：2020/6/15 17:35
 */
public class EnumTest {
    public static void main(String[] args) {
        Integer num = 0;
        if (!(EnumYesOrNo.NO.getType().equals(num))){
            System.out.println("成功");
        }else {
            System.out.println("失败");
        }
    }
}
