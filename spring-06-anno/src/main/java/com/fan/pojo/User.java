package com.fan.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于注册<bean id= class=/>
@Component
public class User {
    @Value("楚凡")
    public String name;
}
