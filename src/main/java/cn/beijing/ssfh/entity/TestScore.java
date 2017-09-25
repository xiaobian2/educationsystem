package cn.beijing.ssfh.entity;

import java.util.Date;

public class TestScore {
    private Integer testCodeId;

    private Integer testPaperId;

    private Integer studentId;

    private Double score;

    private Date testTime;

    public Integer getTestCodeId() {
        return testCodeId;
    }

    public void setTestCodeId(Integer testCodeId) {
        this.testCodeId = testCodeId;
    }

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Date getTestTime() {
        return testTime;
    }

    public void setTestTime(Date testTime) {
        this.testTime = testTime;
    }
}