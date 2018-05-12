package com.springboot.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.entity.User;
import com.springboot.service.IUserService;
import com.springboot.utils.ConfigProperties;
import com.springboot.utils.exception.DescException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    @Autowired
    ConfigProperties configProperties;
    @RequestMapping("/index/{sss}")
    @ResponseBody
    public String hello(@PathVariable("sss") String sss) throws Exception{
        System.out.println("=============>sss="+sss);
        if("admin".equals(sss)){
            throw new DescException("permission denyed");
        }
        System.out.println(JSON.toJSONString(configProperties));
        return "hello中文";
    }
    @Autowired
    IUserService userService;
    @RequestMapping(value = "/greeting")
    public ModelAndView test(ModelAndView mv) throws Exception{
        mv.setViewName("/greeting");
        System.out.println( JSON.toJSONString(userService.query(null)));
        mv.addObject("title","欢迎使用Thymeleaf!");
        return mv;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(User user) throws Exception{
        System.out.println("=============>param="+JSON.toJSONString(user));
        return JSON.toJSONString(userService.queryAnntation(user));
    }
}
