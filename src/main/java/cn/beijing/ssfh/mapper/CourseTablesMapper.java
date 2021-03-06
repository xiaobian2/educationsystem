package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.pojo.vo.CourseTableVO;

import java.util.List;

public interface CourseTablesMapper {
    int deleteByPrimaryKey(Integer courseTablesId);

    int insert(CourseTables record);

    int insertSelective(CourseTables record);

    List<CourseTableVO> selectByPrimaryKey(Integer courseTablesId);

    List<CourseTableVO> selectCourse();

    int updateByPrimaryKeySelective(CourseTables record);

    int updateByPrimaryKey(CourseTables record);

}