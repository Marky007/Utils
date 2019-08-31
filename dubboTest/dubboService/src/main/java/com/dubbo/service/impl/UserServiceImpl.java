package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.interfa.UserService;

/**
 * @Description：
 * @author： Mark蜀黍
 * @date： 2019/8/29 22:47
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getName() {
        return "It's Successful!";
    }
}
