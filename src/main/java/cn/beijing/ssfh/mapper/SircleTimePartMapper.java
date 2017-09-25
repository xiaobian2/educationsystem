package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.SircleTimePart;

public interface SircleTimePartMapper {
    int deleteByPrimaryKey(Integer sircleTimePartId);

    int insert(SircleTimePart record);

    int insertSelective(SircleTimePart record);

    SircleTimePart selectByPrimaryKey(Integer sircleTimePartId);

    int updateByPrimaryKeySelective(SircleTimePart record);

    int updateByPrimaryKey(SircleTimePart record);
}