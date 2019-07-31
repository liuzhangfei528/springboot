package com.qianfneg.springbootmybatis.mapper;

import com.qianfneg.springbootmybatis.entity.TStudent;

public interface TStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TStudent record);

    int insertSelective(TStudent record);

    TStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TStudent record);

    int updateByPrimaryKey(TStudent record);
}