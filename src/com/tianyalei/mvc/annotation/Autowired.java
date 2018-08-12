package com.tianyalei.mvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/** 
 * Created by wuwf on 17/6/27. 
 */  
@Target({ElementType.FIELD})  
@Retention(RetentionPolicy.RUNTIME)  
@Documented  
public @interface Autowired {  
    String value() default "";  
}  