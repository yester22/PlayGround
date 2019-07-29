package kr.playground.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@Configuration 
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{ 
	@Autowired
    AuthProvider authProvider;
	    
    @Autowired
    CustomAuthenticationFailure authFailureHandler;
    
    @Autowired
    CustomAuthenticationSuccess authSuccessHandler;

    @Override
    public void configure(WebSecurity web) throws Exception {
        // 허용되어야 할 경로들
        web.ignoring().antMatchers("/resources/**", 
                                   "/dist/**", 
                                   "/weather", 
                                   "/user/password/find",
                                   "/user/join",
                                   "/user/email",
                                   "/user/send/temppw",
                                   "/findpw", 
                                   "/user/findpw",
                                   "/user/cert/check",
                                   "/join", 
                                   "/getLanguage/**",
                                   "/getMessage"); // #3
    }
    
	@Override 
	protected void configure(HttpSecurity http) throws Exception 	{ 
        http
        	.authorizeRequests()
            .antMatchers("/", "/login","/service","/resources/**","/create").permitAll()
            .antMatchers("/admin").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .loginProcessingUrl("/loginProcess")
            .defaultSuccessUrl("/main")
            .failureHandler(authFailureHandler)
            .successHandler(authSuccessHandler)
            .usernameParameter("id")
            .passwordParameter("password")
            .and()    
            // 로그아웃 관련 설정
            .logout().logoutRequestMatcher(new AntPathRequestMatcher("/user/logout"))
            .logoutSuccessUrl("/")
            .invalidateHttpSession(true)
            .and()
            // csrf 사용유무 설정
            // csrf 설정을 사용하면 모든 request에 csrf 값을 함께 전달해야한다.
            .csrf()
            .and()
            // 로그인 프로세스가 진행될 provider
            .authenticationProvider(authProvider);

	} 
	
	
}
