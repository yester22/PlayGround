package kr.playground.jobs.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import kr.playground.jobs.vo.AdminMemberVo;

public interface AdminMemberService  extends UserDetailsService{
	public AdminMemberVo view(AdminMemberVo vo) throws Exception;
}
