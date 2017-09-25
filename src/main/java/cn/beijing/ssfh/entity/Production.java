package cn.beijing.ssfh.entity;

import java.util.Date;

public class Production {
    private Integer productionId;

    private Integer majorId;

    private Double versionNum;

    private Date startTime;

    private Date endTime;

    private Integer versionState;

    public Integer getProductionId() {
        return productionId;
    }

    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Double getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Double versionNum) {
        this.versionNum = versionNum;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getVersionState() {
        return versionState;
    }

    public void setVersionState(Integer versionState) {
        this.versionState = versionState;
    }
}