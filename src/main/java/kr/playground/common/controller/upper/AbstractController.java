package kr.playground.common.controller.upper;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

public class AbstractController {

	@Value("application.mode")
	protected String mode;
	
	protected static Logger log = Logger.getLogger(AbstractController.class.getName());
	
	
}
