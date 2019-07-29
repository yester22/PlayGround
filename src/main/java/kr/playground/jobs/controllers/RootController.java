package kr.playground.jobs.controllers;


import javax.servlet.http.HttpServletRequest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	private final Logger logger = LoggerFactory.getLogger(RootController.class);
	
	/**
	 * @Method Name  : root
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 메소스 설명
	*/
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginByGet(Model model,HttpServletRequest req){
		model.addAttribute("message",req.getServletContext());
		return "/login";
	}
	
	@GetMapping("/loginProcess")
	public String loginProcess(HttpServletRequest req){
		
		logger.debug("testtest");
		
		return "ROLE_AADMIN";
	}
	 
	
	@GetMapping("/loginSuccess")
	public String loginSuccess(HttpServletRequest req){
		return "/main";
	}

	@GetMapping("/")
	public String root(HttpServletRequest req){
		return "/login";
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
