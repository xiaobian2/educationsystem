package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Employment;

public interface EmploymentMapper {
    int deleteByPrimaryKey(Integer employmentId);

    int insert(Employment record);

    int insertSelective(Employment record);

    Employment selectByPrimaryKey(Integer employmentId);

    int updateByPrimaryKeySelective(Employment record);

    int updateByPrimaryKey(Employment record);
}