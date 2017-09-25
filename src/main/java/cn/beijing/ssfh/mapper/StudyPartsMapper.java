package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.StudyParts;

public interface StudyPartsMapper {
    int deleteByPrimaryKey(Integer studyPartsId);

    int insert(StudyParts record);

    int insertSelective(StudyParts record);

    StudyParts selectByPrimaryKey(Integer studyPartsId);

    int updateByPrimaryKeySelective(StudyParts record);

    int updateByPrimaryKey(StudyParts record);
}