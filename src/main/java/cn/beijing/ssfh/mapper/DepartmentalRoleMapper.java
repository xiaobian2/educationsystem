package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DepartmentalRole;

public interface DepartmentalRoleMapper {
    int deleteByPrimaryKey(Integer departmentalRoleId);

    int insert(DepartmentalRole record);

    int insertSelective(DepartmentalRole record);

    DepartmentalRole selectByPrimaryKey(Integer departmentalRoleId);

    int updateByPrimaryKeySelective(DepartmentalRole record);

    int updateByPrimaryKey(DepartmentalRole record);
}