package kr.playground.jobs.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import kr.playground.common.controller.upper.AbstractController;

/**
 * page 다이렉션을 위한 컨트롤러
 * @author kyoungjin
 *
 */
@Controller
public class PlayGroundGoController extends AbstractController {

	
	/** page 이동시키기
	 * @param page
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/go", method = RequestMethod.GET )
	public String go ( @RequestParam("page") String page, HttpServletRequest request,  HttpServletResponse response, Model model )  {
		try {
			log.debug("##############################################");
			log.debug(this.getClass() + "s parameter = " + page);
			
			model.addAttribute("test", "test");
			
			
		} catch ( Exception e ) {
			e.printStackTrace();
		}
		return page;
	}

	 @GetMapping("/")        
	 public String root(Model model) throws Exception {        
		 return "redirect:/index";         
	 }
	
	 @GetMapping("/index")        
	 public String home(Model model) throws Exception {        
		 return "index";         
	 }
	
}
