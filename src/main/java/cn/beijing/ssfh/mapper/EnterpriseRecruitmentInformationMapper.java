package cn.beijing.ssfh.mapper;

import cn.beijing.ssfh.entity.EnterpriseRecruitmentInformation;

public interface EnterpriseRecruitmentInformationMapper {
    int deleteByPrimaryKey(Integer enterpriseRecruitmentInformationId);

    int insert(EnterpriseRecruitmentInformation record);

    int insertSelective(EnterpriseRecruitmentInformation record);

    EnterpriseRecruitmentInformation selectByPrimaryKey(Integer enterpriseRecruitmentInformationId);

    int updateByPrimaryKeySelective(EnterpriseRecruitmentInformation record);

    int updateByPrimaryKey(EnterpriseRecruitmentInformation record);
}