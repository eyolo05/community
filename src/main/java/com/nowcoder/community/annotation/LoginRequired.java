package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 声明注解可以写在方法之上，用于描述方法
@Target(ElementType.METHOD)
// 声明注解的有效时间，程序运行时才有效
@Retention(RetentionPolicy.RUNTIME)
// 这个类只起到标识的作用
public @interface LoginRequired {

}
