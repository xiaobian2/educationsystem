package cn.beijing.ssfh.entity;

import java.util.Date;

public class TeachingPlan {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.teching_plan_id
     *
     * @mbggenerated
     */
    private Integer techingPlanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.path_id
     *
     * @mbggenerated
     */
    private Integer pathId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.teacher_id
     *
     * @mbggenerated
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.teching_plan_name
     *
     * @mbggenerated
     */
    private String techingPlanName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.teching_plan_url
     *
     * @mbggenerated
     */
    private String techingPlanUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teaching_plan.details
     *
     * @mbggenerated
     */
    private String details;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.teching_plan_id
     *
     * @return the value of teaching_plan.teching_plan_id
     *
     * @mbggenerated
     */
    public Integer getTechingPlanId() {
        return techingPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.teching_plan_id
     *
     * @param techingPlanId the value for teaching_plan.teching_plan_id
     *
     * @mbggenerated
     */
    public void setTechingPlanId(Integer techingPlanId) {
        this.techingPlanId = techingPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.path_id
     *
     * @return the value of teaching_plan.path_id
     *
     * @mbggenerated
     */
    public Integer getPathId() {
        return pathId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.path_id
     *
     * @param pathId the value for teaching_plan.path_id
     *
     * @mbggenerated
     */
    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.teacher_id
     *
     * @return the value of teaching_plan.teacher_id
     *
     * @mbggenerated
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.teacher_id
     *
     * @param teacherId the value for teaching_plan.teacher_id
     *
     * @mbggenerated
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.teching_plan_name
     *
     * @return the value of teaching_plan.teching_plan_name
     *
     * @mbggenerated
     */
    public String getTechingPlanName() {
        return techingPlanName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.teching_plan_name
     *
     * @param techingPlanName the value for teaching_plan.teching_plan_name
     *
     * @mbggenerated
     */
    public void setTechingPlanName(String techingPlanName) {
        this.techingPlanName = techingPlanName == null ? null : techingPlanName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.create_time
     *
     * @return the value of teaching_plan.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.create_time
     *
     * @param createTime the value for teaching_plan.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.teching_plan_url
     *
     * @return the value of teaching_plan.teching_plan_url
     *
     * @mbggenerated
     */
    public String getTechingPlanUrl() {
        return techingPlanUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.teching_plan_url
     *
     * @param techingPlanUrl the value for teaching_plan.teching_plan_url
     *
     * @mbggenerated
     */
    public void setTechingPlanUrl(String techingPlanUrl) {
        this.techingPlanUrl = techingPlanUrl == null ? null : techingPlanUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teaching_plan.details
     *
     * @return the value of teaching_plan.details
     *
     * @mbggenerated
     */
    public String getDetails() {
        return details;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teaching_plan.details
     *
     * @param details the value for teaching_plan.details
     *
     * @mbggenerated
     */
    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }
}