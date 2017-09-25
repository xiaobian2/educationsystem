package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.Production;

public interface ProductionMapper {
    int deleteByPrimaryKey(Integer productionId);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(Integer productionId);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);
}