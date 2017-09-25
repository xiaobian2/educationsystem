package cn.beijing.ssfh.entity;

import java.util.Date;

public class EnterpriseRecruitmentInformation {
    private Integer enterpriseRecruitmentInformationId;

    private Integer enterpriseId;

    private String recruitingPost;

    private String recruitmentSalary;

    private Integer hiring;

    private String educationalRequirements;

    private String foreignLanguageRequirements;

    private String modeOfRecruitment;

    private String workAddress;

    private Date dateOfRecruitment;

    public Integer getEnterpriseRecruitmentInformationId() {
        return enterpriseRecruitmentInformationId;
    }

    public void setEnterpriseRecruitmentInformationId(Integer enterpriseRecruitmentInformationId) {
        this.enterpriseRecruitmentInformationId = enterpriseRecruitmentInformationId;
    }

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getRecruitingPost() {
        return recruitingPost;
    }

    public void setRecruitingPost(String recruitingPost) {
        this.recruitingPost = recruitingPost == null ? null : recruitingPost.trim();
    }

    public String getRecruitmentSalary() {
        return recruitmentSalary;
    }

    public void setRecruitmentSalary(String recruitmentSalary) {
        this.recruitmentSalary = recruitmentSalary == null ? null : recruitmentSalary.trim();
    }

    public Integer getHiring() {
        return hiring;
    }

    public void setHiring(Integer hiring) {
        this.hiring = hiring;
    }

    public String getEducationalRequirements() {
        return educationalRequirements;
    }

    public void setEducationalRequirements(String educationalRequirements) {
        this.educationalRequirements = educationalRequirements == null ? null : educationalRequirements.trim();
    }

    public String getForeignLanguageRequirements() {
        return foreignLanguageRequirements;
    }

    public void setForeignLanguageRequirements(String foreignLanguageRequirements) {
        this.foreignLanguageRequirements = foreignLanguageRequirements == null ? null : foreignLanguageRequirements.trim();
    }

    public String getModeOfRecruitment() {
        return modeOfRecruitment;
    }

    public void setModeOfRecruitment(String modeOfRecruitment) {
        this.modeOfRecruitment = modeOfRecruitment == null ? null : modeOfRecruitment.trim();
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress == null ? null : workAddress.trim();
    }

    public Date getDateOfRecruitment() {
        return dateOfRecruitment;
    }

    public void setDateOfRecruitment(Date dateOfRecruitment) {
        this.dateOfRecruitment = dateOfRecruitment;
    }
}