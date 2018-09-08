package kr.playground.config;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import kr.playground.jobs.service.AdminMemberService; 


@Configuration 
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{ 
	@Autowired 
	private AdminMemberService userService; 
	
	@Override 
	protected void configure(HttpSecurity http) throws Exception 	{ 
		http .csrf()
			 .disable()
			 .authorizeRequests()
			 .anyRequest()
			 .authenticated() 
			 .and() 
			 .formLogin(); 
	} 
	@Override 
	protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
		auth.userDetailsService(userService); 
	} 
}
