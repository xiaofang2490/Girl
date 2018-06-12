package com.zl.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by ef on 2018/6/11.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {

    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
