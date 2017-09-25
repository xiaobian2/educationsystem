package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TestScore;

public interface TestScoreMapper {
    int deleteByPrimaryKey(Integer testCodeId);

    int insert(TestScore record);

    int insertSelective(TestScore record);

    TestScore selectByPrimaryKey(Integer testCodeId);

    int updateByPrimaryKeySelective(TestScore record);

    int updateByPrimaryKey(TestScore record);
}