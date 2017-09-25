package cn.beijing.ssfh.pojo.vo;

import java.util.List;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class UserLoginVo {
    private Integer tbuserId;
    private String username,password;
    private List<RoleVO> list;

    public UserLoginVo() {
    }

    public UserLoginVo(Integer tbuserId, String username, String password, List<RoleVO> list) {

        this.tbuserId = tbuserId;
        this.username = username;
        this.password = password;
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserLoginVo{" +
                "tbuserId=" + tbuserId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", list=" + list +
                '}';
    }

    public Integer getTbuserId() {
        return tbuserId;
    }

    public void setTbuserId(Integer tbuserId) {
        this.tbuserId = tbuserId;
    }

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

    public List<RoleVO> getList() {
        return list;
    }

    public void setList(List<RoleVO> list) {
        this.list = list;
    }
}
