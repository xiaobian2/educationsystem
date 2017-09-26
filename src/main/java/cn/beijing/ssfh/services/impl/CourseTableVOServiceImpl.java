package cn.beijing.ssfh.services.impl;

import cn.beijing.ssfh.entity.CourseTables;
import cn.beijing.ssfh.mapper.CourseTablesMapper;
import cn.beijing.ssfh.pojo.vo.CourseTableVO;
import cn.beijing.ssfh.services.CourseTableVOService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by Administrator on 2017/9/26.
 * Author bianliqiang
 */
@Service
public class CourseTableVOServiceImpl implements CourseTableVOService {
    @Inject
    private CourseTablesMapper courseTablesMapper;
    @Override
    public int deleteByPrimaryKey(Integer courseTablesId) {
        return courseTablesMapper.deleteByPrimaryKey(courseTablesId);
    }

    @Override
    public int insert(CourseTables record) {
        return courseTablesMapper.insert(record);
    }

    @Override
    public int insertSelective(CourseTables record) {
        return courseTablesMapper.insertSelective(record);
    }

    @Override
    public List<CourseTableVO> selectByPrimaryKey(Integer courseTablesId) {
        return courseTablesMapper.selectByPrimaryKey(courseTablesId);
    }

    @Override
    public List<CourseTableVO> selectCourse() {
        return courseTablesMapper.selectCourse();
    }

    @Override
    public int updateByPrimaryKeySelective(CourseTables record) {
        return courseTablesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(CourseTables record) {
        return courseTablesMapper.updateByPrimaryKey(record);
    }
}
