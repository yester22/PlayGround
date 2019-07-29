package kr.playground.config;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import groovy.transform.EqualsAndHashCode;
import kr.playground.jobs.vo.AdminMemberVo;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
public class MyAuthenticaion extends UsernamePasswordAuthenticationToken {

	private static final long serialVersionUID = 1L;

	private String userId;
	private AdminMemberVo user;

	public MyAuthenticaion(String id, String password, List<GrantedAuthority> grantedAuthorityList, AdminMemberVo user) {
		super(id, password, grantedAuthorityList);
		this.setUser(user);
		this.setUserId(userId);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AdminMemberVo getUser() {
		return user;
	}

	public void setUser(AdminMemberVo user) {
		this.user = user;
	}

}