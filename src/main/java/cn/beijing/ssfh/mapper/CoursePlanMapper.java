package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.CoursePlan;

public interface CoursePlanMapper {
    int deleteByPrimaryKey(Integer coursePlanId);

    int insert(CoursePlan record);

    int insertSelective(CoursePlan record);

    CoursePlan selectByPrimaryKey(Integer coursePlanId);

    int updateByPrimaryKeySelective(CoursePlan record);

    int updateByPrimaryKey(CoursePlan record);
}