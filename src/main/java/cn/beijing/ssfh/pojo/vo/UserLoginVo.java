package cn.beijing.ssfh.pojo.vo;

import java.util.List;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class UserLoginVo {
    private Integer tbuserId;
    private String username,password;
    private List<Integer> roleId;
    private List<Integer> premissionId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Integer> roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getPremissionId() {
        return premissionId;
    }

    public void setPremissionId(List<Integer> premissionId) {
        this.premissionId = premissionId;
    }

    public Integer getTbuserId() {

        return tbuserId;
    }

    public void setTbuserId(Integer tbuserId) {
        this.tbuserId = tbuserId;
    }
}
