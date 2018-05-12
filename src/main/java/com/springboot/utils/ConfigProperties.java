package com.springboot.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * 配置文件
 */
@Component("configProperties")
public class ConfigProperties {
    @Value("${config_value}")
    private String configValue;

    @Value("${config_name}")
    private String configName;

    @Value("${random_value}")
    private String random_value;

    @Value("${random_test1}")
    private String random_test1;

    @Value("${random_test2}")
    private String random_test2;
    public String getConfigValue() {
        return configValue;
    }

    public String getConfigName() {
        return configName;
    }

    public String getRandom_value() {
        return random_value;
    }

    public void setRandom_value(String random_value) {
        this.random_value = random_value;
    }

    public String getRandom_test1() {
        return random_test1;
    }

    public void setRandom_test1(String random_test1) {
        this.random_test1 = random_test1;
    }

    public String getRandom_test2() {
        return random_test2;
    }

    public void setRandom_test2(String random_test2) {
        this.random_test2 = random_test2;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }
}
