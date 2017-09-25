package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GradeSircle;

public interface GradeSircleMapper {
    int deleteByPrimaryKey(Integer gradeSircleId);

    int insert(GradeSircle record);

    int insertSelective(GradeSircle record);

    GradeSircle selectByPrimaryKey(Integer gradeSircleId);

    int updateByPrimaryKeySelective(GradeSircle record);

    int updateByPrimaryKey(GradeSircle record);
}