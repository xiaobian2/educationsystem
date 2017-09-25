package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.RolePermissions;

public interface RolePermissionsMapper {
    int deleteByPrimaryKey(Integer rolePermissionsId);

    int insert(RolePermissions record);

    int insertSelective(RolePermissions record);

    RolePermissions selectByPrimaryKey(Integer rolePermissionsId);

    int updateByPrimaryKeySelective(RolePermissions record);

    int updateByPrimaryKey(RolePermissions record);
}