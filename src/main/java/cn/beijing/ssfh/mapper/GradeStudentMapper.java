package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GradeStudent;

public interface GradeStudentMapper {
    int deleteByPrimaryKey(Integer gradeStudentId);

    int insert(GradeStudent record);

    int insertSelective(GradeStudent record);

    GradeStudent selectByPrimaryKey(Integer gradeStudentId);

    int updateByPrimaryKeySelective(GradeStudent record);

    int updateByPrimaryKey(GradeStudent record);
}