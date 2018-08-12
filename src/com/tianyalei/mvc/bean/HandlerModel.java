package com.tianyalei.mvc.bean;

import java.lang.reflect.Method;
import java.util.Map;

public class HandlerModel {
   public Method method;  
   public Object controller;  
   public Map<String, Integer> paramMap;  

    public HandlerModel(Method method, Object controller, Map<String, Integer> paramMap) {  
        this.method = method;  
        this.controller = controller;  
        this.paramMap = paramMap;  
    }  
}
