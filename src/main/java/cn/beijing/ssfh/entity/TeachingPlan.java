package cn.beijing.ssfh.entity;

import java.util.Date;

public class TeachingPlan {
    private Integer techingPlanId;

    private Integer pathId;

    private Integer teacherId;

    private String techingPlanName;

    private Date createTime;

    private String techingPlanUrl;

    private String details;

    public Integer getTechingPlanId() {
        return techingPlanId;
    }

    public void setTechingPlanId(Integer techingPlanId) {
        this.techingPlanId = techingPlanId;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTechingPlanName() {
        return techingPlanName;
    }

    public void setTechingPlanName(String techingPlanName) {
        this.techingPlanName = techingPlanName == null ? null : techingPlanName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTechingPlanUrl() {
        return techingPlanUrl;
    }

    public void setTechingPlanUrl(String techingPlanUrl) {
        this.techingPlanUrl = techingPlanUrl == null ? null : techingPlanUrl.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}