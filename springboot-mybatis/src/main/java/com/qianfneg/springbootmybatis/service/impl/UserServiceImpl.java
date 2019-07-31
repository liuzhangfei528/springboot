package com.qianfneg.springbootmybatis.service.impl;

import com.qianfneg.springbootmybatis.entity.TUser;
import com.qianfneg.springbootmybatis.mapper.TUserMapper;
import com.qianfneg.springbootmybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Aix
 * @date 2019/7/29
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
