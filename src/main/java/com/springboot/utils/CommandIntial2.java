package com.springboot.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CommandIntial2 implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("------------------->系统资源初始化...");
    }
}
