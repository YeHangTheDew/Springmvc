package com.tianyalei.mvc.annotation;
import java.lang.annotation.*;  

/** 
 * Created by wuwf on 17/6/27. 
 */  
@Target({ElementType.TYPE, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
public @interface RequestMapping {  
    String value() default "";  
}  