package com.cargocn.cloud.server.dao;

import com.cargocn.cloud.web.bean.WxDriverLoc;

public interface WxDriverLocMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WxDriverLoc record);

    int insertSelective(WxDriverLoc record);

    WxDriverLoc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WxDriverLoc record);

    int updateByPrimaryKey(WxDriverLoc record);
}