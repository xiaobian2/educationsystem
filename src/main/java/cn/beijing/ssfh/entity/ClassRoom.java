package cn.beijing.ssfh.entity;

public class ClassRoom {
    private Integer classroomId;

    private Integer stateId;

    private String classroomName;

    private Integer maxNum;

    private String classroomUse;

    public Integer getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Integer classroomId) {
        this.classroomId = classroomId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName == null ? null : classroomName.trim();
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public String getClassroomUse() {
        return classroomUse;
    }

    public void setClassroomUse(String classroomUse) {
        this.classroomUse = classroomUse == null ? null : classroomUse.trim();
    }
}