package com.fan.config;

import com.fan.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//要在user那里写component才能扫到，但是不写component也能正常执行，因为这里有bean
//@ComponentScan("com.fan.pojo")
public class fanConfig {
    @Bean
    User getUser(){
        return new User();
    }
}
