package com.yeahzee.test;

import com.yeahzee.test.pojo.CopyUser;
import com.yeahzee.test.pojo.User;
import org.springframework.beans.BeanUtils;

public class BeanUtilsTest {
    public static void main(String[] args) {
        User user = new User();
        user.setAge(10);
        user.setName("测试");

        CopyUser copyUser = new CopyUser();
        BeanUtils.copyProperties(user,copyUser);

        System.out.println(copyUser);
    }
}