package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.TeacherCourse;

public interface TeacherCourseMapper {
    int deleteByPrimaryKey(Integer teacherCourseId);

    int insert(TeacherCourse record);

    int insertSelective(TeacherCourse record);

    TeacherCourse selectByPrimaryKey(Integer teacherCourseId);

    int updateByPrimaryKeySelective(TeacherCourse record);

    int updateByPrimaryKey(TeacherCourse record);
}