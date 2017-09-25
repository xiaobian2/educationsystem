package cn.beijing.ssfh.entity;

public class Teacher {
    private Integer teacherId;

    private Integer stateId;

    private Integer userRoleId;

    private String teacherName;

    private Integer gender;

    private String telephone;

    private String email;

    private Integer teacherTeachAge;

    private String teacherMajor;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName == null ? null : teacherName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getTeacherTeachAge() {
        return teacherTeachAge;
    }

    public void setTeacherTeachAge(Integer teacherTeachAge) {
        this.teacherTeachAge = teacherTeachAge;
    }

    public String getTeacherMajor() {
        return teacherMajor;
    }

    public void setTeacherMajor(String teacherMajor) {
        this.teacherMajor = teacherMajor == null ? null : teacherMajor.trim();
    }
}