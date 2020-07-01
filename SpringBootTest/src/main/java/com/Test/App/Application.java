package com.Test.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动类
 *
 * @author ：Axel
 * @since ：2020/6/12 18:00
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.Test"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
