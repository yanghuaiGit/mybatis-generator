package com.yh.mybatisgeneter.mapper;

import com.yh.mybatisgeneter.model.Closeorder;

public interface CloseorderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Closeorder record);

    int insertSelective(Closeorder record);

    Closeorder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Closeorder record);

    int updateByPrimaryKey(Closeorder record);
}