package com.atguigu.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm{

	//进行授权的方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		return null;
	}

	//进行认证的方法.
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken arg0) throws AuthenticationException {
		return null;
	}

}
