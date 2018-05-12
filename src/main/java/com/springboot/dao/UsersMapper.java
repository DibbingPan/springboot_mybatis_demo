package com.springboot.dao;

import com.springboot.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersMapper {
    List<User> select(User u);
}
