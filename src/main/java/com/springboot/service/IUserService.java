package com.springboot.service;

import com.springboot.entity.User;

import java.util.List;

public interface IUserService {
    List<User> query(User u) throws Exception;

    List<User> queryAnntation(User u) throws Exception;
}
