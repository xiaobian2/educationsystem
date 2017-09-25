package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.MenuPermissions;

public interface MenuPermissionsMapper {
    int deleteByPrimaryKey(Integer menuPermissionsId);

    int insert(MenuPermissions record);

    int insertSelective(MenuPermissions record);

    MenuPermissions selectByPrimaryKey(Integer menuPermissionsId);

    int updateByPrimaryKeySelective(MenuPermissions record);

    int updateByPrimaryKey(MenuPermissions record);
}