package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.DateTime;

public interface DateTimeMapper {
    int deleteByPrimaryKey(Integer dateTimeId);

    int insert(DateTime record);

    int insertSelective(DateTime record);

    DateTime selectByPrimaryKey(Integer dateTimeId);

    int updateByPrimaryKeySelective(DateTime record);

    int updateByPrimaryKey(DateTime record);
}