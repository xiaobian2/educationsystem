package cn.beijing.ssfh.services.impl;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.mapper.LoginMapper;
import cn.beijing.ssfh.services.LoginServices;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.Set;

/**
 * Created by Mr.W on 2017/9/24.
 */
@Service
public class LoginServicesImpl implements LoginServices {
    @Inject
    private LoginMapper loginMapper;

    @Override
    public Tbuser getByUsernameAndPassword(String username, String password) {
        return loginMapper.getByUsernameAndPassword(username,password);
    }

    @Override
    public Set<Integer> getRoles(String userName, String password) {
        return loginMapper.getRoles(userName,password);
    }

    @Override
    public Set<Integer> getPermissions(String userName, String password) {
        return loginMapper.getPermissions(userName,password);
    }
}
