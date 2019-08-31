package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.interfa.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description：
 * @author： Mark蜀黍
 * @date： 2019/8/29 21:40
 */
@RestController
@RequestMapping("/user")
public class dubboController {

    @Reference
    private UserService userService;

    @RequestMapping("showName")
    @ResponseBody
    public String returnTest(){
        return  userService.getName();
    }

}
