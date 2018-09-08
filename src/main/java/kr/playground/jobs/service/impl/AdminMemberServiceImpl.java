package kr.playground.jobs.service.impl;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kr.playground.jobs.dao.AdminMemberDao;
import kr.playground.jobs.service.AdminMemberService;
import kr.playground.jobs.vo.AdminMemberVo;

@Service
public class AdminMemberServiceImpl implements AdminMemberService{

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private AdminMemberDao adminMemberDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		AdminMemberVo vo = new AdminMemberVo();
		try {
			vo.setMemberId(username);
			vo = view(vo);
		}catch (Exception e) {
			try {
				throw new Exception();
			} catch (Exception e1) {
				log.error("loadUserByUsername",e1);
			}
		}
		return (UserDetails) vo;
	}

	@Override
	public AdminMemberVo view(AdminMemberVo vo) throws Exception {
		return adminMemberDao.view(vo);
	}

}
