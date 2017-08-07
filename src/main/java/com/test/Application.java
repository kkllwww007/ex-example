package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目名称：ex-example
 * 包名：com.test
 * 类名称：Application.java
 * 类描述：
 * 创建人：wangxiukun
 * 创建时间：2017/8/4 20:38
 * 修改人：wangxiukun
 * 修改时间：2017/8/4 20:38
 * 修改备注：
 */
@SpringBootApplication
@MapperScan(basePackages = "com.test.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
