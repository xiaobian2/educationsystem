package cn.beijing.ssfh.entity;

public class CoursePlan {
    private Integer coursePlanId;

    private Integer gradeId;

    private Integer chapterId;

    private Integer schedule;

    public Integer getCoursePlanId() {
        return coursePlanId;
    }

    public void setCoursePlanId(Integer coursePlanId) {
        this.coursePlanId = coursePlanId;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }
}