package com.Test;

/**
 * 测试递归
 *
 * @author ：Axel
 * @date ：2020/6/10 11:51
 */
public class diguiTest {
    public static void main(String[] args) {
        getFactorial(4);
    }

    public static int getFactorial(int n){
        if (n > 0) {
            if (n == 0) {
                System.out.println(n + "!=1");
                return 1;
            } else {
                System.out.println(n);
                int temp = n * getFactorial(n - 1);
                System.out.println(n + "!=" + temp);
                return temp;
            }
        }
        return -1;
    }

}
