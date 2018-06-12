package com.zl.domain;

import sun.awt.SunHints;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by ef on 2018/6/11.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    @Min(value = 18,message = "未成年少女禁止入内")
    private Integer age;


    private String name;

    public Girl() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
