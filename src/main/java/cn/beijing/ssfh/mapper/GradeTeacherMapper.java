package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.GradeTeacher;

public interface GradeTeacherMapper {
    int deleteByPrimaryKey(Integer gradeTeacherId);

    int insert(GradeTeacher record);

    int insertSelective(GradeTeacher record);

    GradeTeacher selectByPrimaryKey(Integer gradeTeacherId);

    int updateByPrimaryKeySelective(GradeTeacher record);

    int updateByPrimaryKey(GradeTeacher record);
}