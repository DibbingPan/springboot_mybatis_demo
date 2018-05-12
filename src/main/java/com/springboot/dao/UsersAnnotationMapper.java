package com.springboot.dao;

import com.springboot.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("usersAnnotationMapper")
public interface UsersAnnotationMapper {
    @Results(id="UserResults",value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "user_name"),
    })
    @Select("<script>SELECT id,user_name FROM base_user where 1=1 " +
            "<if test=\"id != null and id != ''\"> and id = #{id}</if>" +
            "</script>")
    List<User> select(User u);

    // 使用了mybatis.configuration.map-underscore-to-camel-case 配置,自动匹配驼峰命名法
    @Select("<script>SELECT id,user_name FROM base_user where id = #{id} </script>")
    User selectById(@Param("id") String id);
}
