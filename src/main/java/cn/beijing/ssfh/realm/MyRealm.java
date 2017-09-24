package cn.beijing.ssfh.realm;


import cn.beijing.ssfh.services.LoginServices;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.inject.Inject;


public class MyRealm extends AuthorizingRealm{

	@Inject
	private LoginServices loginServices;
	
	/**
	 * Ϊ����ǰ��¼���û������ɫ��Ȩ
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//		String userName=(String)principals.getPrimaryPrincipal();
//		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
//		authorizationInfo.setRoles(loginServices.getRoles(userName));
//		authorizationInfo.setStringPermissions(loginServices.getPermissions(userName));
//		return authorizationInfo;
		return null;
	}

	/**
	 * ��֤��ǰ��¼���û�
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String)token.getPrincipal();
//			User user=userService.getByUserName(userName);
//			if(user!=null){
//				AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"xx");
//				return authcInfo;
//			}else{
//				return null;
//			}
		return null;
	}

}
