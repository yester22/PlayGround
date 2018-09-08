package kr.playground.jobs.controllers;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sun.javafx.collections.MappingChange.Map;

import kr.playground.common.controller.upper.AbstractController;
import kr.playground.jobs.vo.AdminMemberVo;

/**
 * 파일 설명
 * @package  : kr.playground.jobs.controllers
 * @FileName : RootController.java
 * @Project  : PlayGround
 * @Date  : 2018-08-17
 * @version  : 1.0.0
 * @author  : 정경진
 * @History  :
 * <pre>
 *    정경진, 1.0, 2018-08-17 최초작성
 * </pre>
 */
@Controller
public class RootController  extends AbstractController  {
	/**
	 * @Method Name  : root
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/")        
	public String root(Model model) throws Exception {        
		return "redirect:/index";         
	}

	/**
	 * @Method Name  : home
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/index")        
	public String home(Model model) throws Exception {        
		return "index";         
	}

	
	/**
	 * @Method Name  : login
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/login")        
	public String login( AdminMemberVo vo ,  HttpServletRequest request ) throws Exception {        
		
		
		return "login";         
	}


	/**
	 * @Method Name  : loginProcessing
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	 * @param model
	 * @throws Exception
	 */
	@GetMapping("/loginProcessing")        
	public String loginProcessing(AdminMemberVo vo ,  HttpServletRequest request, Model model) throws Exception {
		
		log.debug("testetet");
		
		
		return "redirect:/admin/main";
	}

	
	
	/**
	 * @Method Name  : loginProcessing
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	 * @param model
	 * @throws Exception
	 */
	@GetMapping("/admin/main")        
	public String main(AdminMemberVo vo ,  HttpServletRequest request, Model model) throws Exception {
		return "/admin/main";
	}

	
	
}
