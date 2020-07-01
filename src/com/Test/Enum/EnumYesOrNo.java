package com.Test.Enum;

/**
 * 是否枚举
 *
 * @author ：Axel
 * @since ：2020/6/15 17:31
 */
public enum EnumYesOrNo {

    YES(1,"是"),
    NO(0,"否");


    private Integer type;

    private String msg;

    EnumYesOrNo(Integer type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
