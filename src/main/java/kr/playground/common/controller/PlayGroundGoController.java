package kr.playground.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.playground.common.controller.upper.AbstractController;
import kr.playground.common.interceptor.SessionInterceptor;

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
	@RequestMapping("/go")
	public ModelAndView go ( @RequestParam("page") String page, HttpServletRequest request ) throws Exception {
		ModelAndView mav = new ModelAndView();
		try {
			log.debug("##############################################");
			log.debug(this.getClass() + "s parameter = " + page);
			
			mav.setViewName( page );
			
			
		} catch ( Exception e ) {
			throw new Exception(e);
		}
		return mav;
	}
}
