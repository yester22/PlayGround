package kr.playground.config;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import kr.playground.common.util.Constant;
import kr.playground.common.util.HashUtil;
import kr.playground.jobs.controllers.RootController;
import kr.playground.jobs.service.AdminMemberService;
import kr.playground.jobs.vo.AdminMemberVo;
 
/**
 * 인증 프로바이더
 * 로그인시 사용자가 입력한 아이디와 비밀번호를 확인하고 해당 권한을 주는 클래스
 * 
 * @author wedul
 *
 */
@Component("authProvider")
public class AuthProvider implements AuthenticationProvider  {
    
	private final Logger logger = LoggerFactory.getLogger(AuthProvider.class);
	
	@Autowired 
	private AdminMemberService userService; 
 
    /**
     * 인증하기
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String id = authentication.getName();
        String password = HashUtil.sha256(authentication.getCredentials().toString());
        
        AdminMemberVo user = null;
		try {
			user = userService.view(new AdminMemberVo(id));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        logger.debug( user.getPwd() + ", " + password ) ;
        
        // email에 맞는 user가 없거나 비밀번호가 맞지 않는 경우.
        if (null == user || ! user.getPwd().equals(password)) {
            return null;
        }
        
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();
        
        // 로그인한 계정에게 권한 부여
        if (user.isIsadmin()) {
            grantedAuthorityList.add(new SimpleGrantedAuthority(Constant.ROLE_TYPE.ROLE_ADMIN.toString()));
        } else {
            grantedAuthorityList.add(new SimpleGrantedAuthority(Constant.ROLE_TYPE.ROLE_USER.toString()));
        }
 
        // 로그인 성공시 로그인 사용자 정보 반환
        return new MyAuthenticaion(id, password, grantedAuthorityList, user);
    }
    
    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
 
}
