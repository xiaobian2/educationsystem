package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DayTime;

public interface DayTimeMapper {
    int deleteByPrimaryKey(Integer dayTimeId);

    int insert(DayTime record);

    int insertSelective(DayTime record);

    DayTime selectByPrimaryKey(Integer dayTimeId);

    int updateByPrimaryKeySelective(DayTime record);

    int updateByPrimaryKey(DayTime record);
}