package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.UploadPath;

public interface UploadPathMapper {
    int deleteByPrimaryKey(Integer pathId);

    int insert(UploadPath record);

    int insertSelective(UploadPath record);

    UploadPath selectByPrimaryKey(Integer pathId);

    int updateByPrimaryKeySelective(UploadPath record);

    int updateByPrimaryKey(UploadPath record);
}