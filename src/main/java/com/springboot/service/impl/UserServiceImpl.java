package com.springboot.service.impl;

import com.springboot.dao.UsersAnnotationMapper;
import com.springboot.dao.UsersMapper;
import com.springboot.entity.User;
import com.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件名： UserServiceImpl
 * <p>
 * <p>
 * <p>
 * 北京中油瑞飞信息技术有限公司（http://www.richfit.com）
 * Copyright 2017 Richfit Information Technolagy Co., LTD. All Right Reserved.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public List<User> query(User u) {
        return usersMapper.select(u);
    }

    @Autowired
    UsersAnnotationMapper usersAnnotationMapper;

    @Override
    public List<User> queryAnntation(User u) {
        if(null != u && null!=u.getId()){
            List<User> list = new ArrayList<>(1);
            list.add(this.usersAnnotationMapper.selectById(u.getId()));
            return list;
        }
        return usersAnnotationMapper.select(u);
    }
}
