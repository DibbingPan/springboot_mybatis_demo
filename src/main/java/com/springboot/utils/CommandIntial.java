package com.springboot.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 文件名： CommandIntial
 * <p>
 * <p> 读取配置文件内容
 * <p>
 * 北京中油瑞飞信息技术有限公司（http://www.richfit.com）
 * Copyright 2017 Richfit Information Technolagy Co., LTD. All Right Reserved.
 */
@Component
@Order(1)
public class CommandIntial implements CommandLineRunner {

    @Value("${spring.profiles.active}")
    private String profiles;

    @Override
    public void run(String... args) {
        System.out.println("CommandLineRunner---------->"+profiles);
    }
}
