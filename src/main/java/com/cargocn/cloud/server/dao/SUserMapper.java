package com.cargocn.cloud.server.dao;

import com.cargocn.cloud.web.bean.SUser;

public interface SUserMapper {
    int deleteByPrimaryKey(Long userid);

    int insert(SUser record);

    int insertSelective(SUser record);

    SUser selectByPrimaryKey(Long userid);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKeyWithBLOBs(SUser record);

    int updateByPrimaryKey(SUser record);
}