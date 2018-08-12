package com.tianyalei.mvc.annotation;
import java.lang.annotation.*;  

/** 
 * Created by wuwf on 17/6/27. 
 */  
@Target({ElementType.PARAMETER})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
public @interface RequestParam {  
    String value() default "";  
  
    boolean required() default true;  
}