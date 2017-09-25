package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.EnterpriseContact;

public interface EnterpriseContactMapper {
    int deleteByPrimaryKey(Integer enterpriseContactId);

    int insert(EnterpriseContact record);

    int insertSelective(EnterpriseContact record);

    EnterpriseContact selectByPrimaryKey(Integer enterpriseContactId);

    int updateByPrimaryKeySelective(EnterpriseContact record);

    int updateByPrimaryKey(EnterpriseContact record);
}