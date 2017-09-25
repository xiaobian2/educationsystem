package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.StudentInformation;

public interface StudentInformationMapper {
    int deleteByPrimaryKey(Integer studentId);

    int insert(StudentInformation record);

    int insertSelective(StudentInformation record);

    StudentInformation selectByPrimaryKey(Integer studentId);

    int updateByPrimaryKeySelective(StudentInformation record);

    int updateByPrimaryKey(StudentInformation record);
}