package com.tianyalei.mvc.annotation;

import java.lang.annotation.*;  

/** 
 * Created by admin on 17/6/27. 
 */  
@Target({ElementType.TYPE})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
public @interface Service {  
    String value() default "";  
}  