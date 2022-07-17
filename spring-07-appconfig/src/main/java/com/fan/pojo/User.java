package com.fan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("楚凡")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
