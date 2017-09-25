package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TeachingPlan;

public interface TeachingPlanMapper {
    int deleteByPrimaryKey(Integer techingPlanId);

    int insert(TeachingPlan record);

    int insertSelective(TeachingPlan record);

    TeachingPlan selectByPrimaryKey(Integer techingPlanId);

    int updateByPrimaryKeySelective(TeachingPlan record);

    int updateByPrimaryKey(TeachingPlan record);
}