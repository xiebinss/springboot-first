package com.qf.springbootmybatis.service;



import com.qf.springbootmybatis.entity.User;

import javax.validation.Valid;

/**
 * @Author xiebin
 * @Date ${Date}
 */
public interface IUserService {

    int register(@Valid User user);


    User tem(int userid);
}
