package com.qianfneg.springbootmybatis.service;

import com.qianfneg.springbootmybatis.entity.TUser;

/**
 * @author Aix
 * @date 2019/7/29
 **/
public interface IUserService {
    TUser getUserById(long id);
}
