package com.fan.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect//标注这个类是切面
public class AnnotationPointCut {
    @Before("execution(* com.fan.service.UserServiceImpl.*(..))")
    void before(){
        System.out.println("之前");
    }
    @After("execution(* com.fan.service.UserServiceImpl.*(..))")
    void after(){
        System.out.println("之后");
    }
}
