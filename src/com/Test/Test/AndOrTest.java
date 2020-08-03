package com.Test.Test;

/**
 * 并且或测试
 * <p>TODO</p>
 *
 * @author 多宝
 * @since 2020/7/2 9:25
 */
public class AndOrTest {
    public static void main(String[] args) {
        if (false||true){
            System.out.println(false);
        }else {
            System.out.println(true);
        }

        if (false||false){
            System.out.println(false);
        }else {
            System.out.println(false);
        }
    }
}
