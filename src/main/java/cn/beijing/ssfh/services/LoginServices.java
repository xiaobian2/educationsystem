package cn.beijing.ssfh.services;

import cn.beijing.ssfh.entity.Tbuser;

import java.util.Set;

/**
 * Created by Mr.W on 2017/9/24.
 */
public interface LoginServices {
    /**
     * 通过用户名查询用户
     * @param username
     * @param password
     * @return
     */
    Tbuser getByUsernameAndPassword(String username,String password);

    /**
     * 通过用户名查询角色信息
     * @param userName
     * @param password
     * @return
     */
    Set<Integer> getRoles(String userName, String password);

    /**
     * 通过用户名查询权限信息
     * @param userName
     * @param password
     * @return
     */
    public Set<Integer> getPermissions(String userName,String password);
}
