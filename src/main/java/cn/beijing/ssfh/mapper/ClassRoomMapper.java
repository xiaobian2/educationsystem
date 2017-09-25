package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.ClassRoom;

public interface ClassRoomMapper {
    int deleteByPrimaryKey(Integer classroomId);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    ClassRoom selectByPrimaryKey(Integer classroomId);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}