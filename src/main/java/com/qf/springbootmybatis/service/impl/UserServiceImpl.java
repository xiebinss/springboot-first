package com.qf.springbootmybatis.service.impl;

import com.qf.springbootmybatis.entity.User;
import com.qf.springbootmybatis.mapper.UserMapper;
import com.qf.springbootmybatis.service.IUserService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/**
 * @Author xiebin
 * @Date ${Date}
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public int register(@Valid User user) {
        return userMapper.insert(user);
    }

    @Override
    public User tem(int userid) {
        return userMapper.selectByPrimaryKey(userid);
    }
}
