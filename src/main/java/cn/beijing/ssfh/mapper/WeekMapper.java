package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Week;

public interface WeekMapper {
    int deleteByPrimaryKey(Integer weekId);

    int insert(Week record);

    int insertSelective(Week record);

    Week selectByPrimaryKey(Integer weekId);

    int updateByPrimaryKeySelective(Week record);

    int updateByPrimaryKey(Week record);
}