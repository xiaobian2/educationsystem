package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TestPaper;

public interface TestPaperMapper {
    int deleteByPrimaryKey(Integer testPaperId);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    TestPaper selectByPrimaryKey(Integer testPaperId);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);
}