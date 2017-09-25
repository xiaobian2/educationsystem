package cn.beijing.ssfh.realm;

import cn.beijing.ssfh.entity.Tbuser;
import cn.beijing.ssfh.services.Userservice;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;

/**
 * Created by Mr.W on 2017/9/24.
 */
public class MyRealm extends AuthorizingRealm {
    
    @Resource
    private Userservice userservice;

    /**
    * @Description: 权限认证
    * @Author Mr.W
    * @Date 2017/9/24 21:04
    * @version V1.0
    */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String username = String.valueOf(principalCollection.getPrimaryPrincipal());
        Tbuser user = userservice.loginByUsername(username);
        SimpleAuthorizationInfo  simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setRoles(userservice.getRolesByUsername(username));
        simpleAuthorizationInfo.setStringPermissions(userservice.getPremissionsByUsername(username));
        return simpleAuthorizationInfo;
    }

    /**
    * @Description: 身份认证
    * @Author Mr.W
    * @Date 2017/9/24 21:04
    * @version V1.0
    */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String username = String.valueOf(token.getPrincipal());
        Tbuser user = userservice.loginByUsername(username);
        if ( user == null) {
            return  null;
        }
        AuthenticationInfo info = new SimpleAuthenticationInfo(user.getUsername(),user.getPassword(),getName());

        return info;
    }
}
