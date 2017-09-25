package cn.beijing.ssfh.pojo;

import java.util.Date;

/**
 * Created by fukun on 2017/9/24.
 */
public class CourseTableVO {
    private int courseTablesId;//排课Id
    private int timeRange;//时间范围
    private int dateTimeId;//日期
    private String gradeName;//班级名称
    private int gradeNum;//班级人数
    private String gradeCourse;//班级专业
    private Date starTime;//开班时间
    private String gradeState;//班级状态
    private String SteacherName; //老师名字
    private String teacherMajor ;//所教专业
    private String clsssroomName;//班级名称
    private int classroomUse;//教室用途int

    public CourseTableVO() {
    }

    @Override
    public String toString() {
        return "CourseTableVO{" +
                "courseTablesId=" + courseTablesId +
                ", timeRange=" + timeRange +
                ", dateTimeId=" + dateTimeId +
                ", gradeName='" + gradeName + '\'' +
                ", gradeNum=" + gradeNum +
                ", gradeCourse='" + gradeCourse + '\'' +
                ", starTime=" + starTime +
                ", gradeState='" + gradeState + '\'' +
                ", SteacherName='" + SteacherName + '\'' +
                ", teacherMajor='" + teacherMajor + '\'' +
                ", clsssroomName='" + clsssroomName + '\'' +
                ", classroomUse=" + classroomUse +
                '}';
    }

    public int getCourseTablesId() {
        return courseTablesId;
    }

    public void setCourseTablesId(int courseTablesId) {
        this.courseTablesId = courseTablesId;
    }

    public int getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(int timeRange) {
        this.timeRange = timeRange;
    }

    public int getDateTimeId() {
        return dateTimeId;
    }

    public void setDateTimeId(int dateTimeId) {
        this.dateTimeId = dateTimeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public int getGradeNum() {
        return gradeNum;
    }

    public void setGradeNum(int gradeNum) {
        this.gradeNum = gradeNum;
    }

    public String getGradeCourse() {
        return gradeCourse;
    }

    public void setGradeCourse(String gradeCourse) {
        this.gradeCourse = gradeCourse;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public String getGradeState() {
        return gradeState;
    }

    public void setGradeState(String gradeState) {
        this.gradeState = gradeState;
    }

    public String getSteacherName() {
        return SteacherName;
    }

    public void setSteacherName(String steacherName) {
        SteacherName = steacherName;
    }

    public String getTeacherMajor() {
        return teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor;
    }

    public String getClsssroomName() {
        return clsssroomName;
    }

    public void setClsssroomName(String clsssroomName) {
        this.clsssroomName = clsssroomName;
    }

    public int getClassroomUse() {
        return classroomUse;
    }

    public void setClassroomUse(int classroomUse) {
        this.classroomUse = classroomUse;
    }
}
