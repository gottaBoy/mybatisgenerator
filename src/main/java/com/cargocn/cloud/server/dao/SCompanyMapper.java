package com.cargocn.cloud.server.dao;

import com.cargocn.cloud.web.bean.SCompany;
import com.cargocn.cloud.web.bean.SCompanyWithBLOBs;

public interface SCompanyMapper {
    int deleteByPrimaryKey(Long companyid);

    int insert(SCompanyWithBLOBs record);

    int insertSelective(SCompanyWithBLOBs record);

    SCompanyWithBLOBs selectByPrimaryKey(Long companyid);

    int updateByPrimaryKeySelective(SCompanyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SCompanyWithBLOBs record);

    int updateByPrimaryKey(SCompany record);
}