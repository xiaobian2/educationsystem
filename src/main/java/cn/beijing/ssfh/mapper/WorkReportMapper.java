package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.WorkReport;

public interface WorkReportMapper {
    int deleteByPrimaryKey(Integer workReportId);

    int insert(WorkReport record);

    int insertSelective(WorkReport record);

    WorkReport selectByPrimaryKey(Integer workReportId);

    int updateByPrimaryKeySelective(WorkReport record);

    int updateByPrimaryKey(WorkReport record);
}