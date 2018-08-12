package com.tianyalei.mvc.controller;  
  
import com.tianyalei.mvc.annotation.*;  
import com.tianyalei.mvc.service.ModifyService;  
import com.tianyalei.mvc.service.QueryService;  
  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import java.io.IOException;  
  
/** 
 * Created by wuwf on 17/6/28. 
 */  
@Controller  
@RequestMapping("/web")  
public class WebController {  
    @Autowired("myQueryService")  
    private QueryService queryService;  
    @Autowired  
    private ModifyService modifyService;  
  
    @RequestMapping("/search")  
    public void search(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response) {  
        String result = queryService.search(name);  
        out(response, result);  
    }  
  
    @RequestMapping("/add")  
    public void add(@RequestParam("name") String name,  
                    @RequestParam("addr") String addr,  
                    HttpServletRequest request, HttpServletResponse response) {  
        String result = modifyService.add(name, addr);  
        out(response, result);  
    }  
  
    @RequestMapping("/update")  
    public void update(String name, boolean flag,  
                    HttpServletRequest request, HttpServletResponse response) {  
        out(response, "ÎÒÊÇname£º" + name + "flagÎª£º" + flag);  
    }  
  
    @RequestMapping("/remove")  
    public void remove(@RequestParam("name") Integer id,  
                       HttpServletRequest request, HttpServletResponse response) {  
        String result = modifyService.remove(id);  
        out(response, result);  
    }  
  
    private void out(HttpServletResponse response, String str) {  
        try {  
            response.setContentType("application/json;charset=utf-8");  
            response.getWriter().print(str);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  