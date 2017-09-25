package cn.beijing.ssfh.entity;

public class Tbuser {
    private Integer tbuserId;

    private Integer userInfoId;

    private String username;

    private String password;

    public Integer getTbuserId() {
        return tbuserId;
    }

    public void setTbuserId(Integer tbuserId) {
        this.tbuserId = tbuserId;
    }

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}