package com.qf.springbootmybatis.mapper;

import com.qf.springbootmybatis.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User user);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}