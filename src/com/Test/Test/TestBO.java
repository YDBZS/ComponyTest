package com.Test.Test;

/**
 * 测试
 *
 * @author ：Axel
 * @since ：2020/6/12 18:39
 */
public class TestBO {

    private String stringval;

    private Long longVal;

    public String getStringval() {
        return stringval;
    }

    public void setStringval(String stringval) {
        this.stringval = stringval;
    }

    public Long getLongVal() {
        return longVal;
    }

    public void setLongVal(Long longVal) {
        this.longVal = longVal;
    }

    @Override
    public String toString() {
        return "TestBO{" +
                "stringval='" + stringval + '\'' +
                ", longVal=" + longVal +
                '}';
    }
}
