package cn.beijing.ssfh.services;

import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.pojo.vo.CourseTableVO;

import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 * Author bianliqiang
 */
public interface CourseTableVOService {
    int deleteByPrimaryKey(Integer courseTablesId);

    int insert(CourseTables record);

    int insertSelective(CourseTables record);

    List<CourseTableVO> selectByPrimaryKey(Integer courseTablesId);

    List<CourseTableVO> selectCourse();

    int updateByPrimaryKeySelective(CourseTables record);

    int updateByPrimaryKey(CourseTables record);
}
