package kr.playground.jobs.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.playground.common.constants.JSONConstants;
import kr.playground.jobs.service.CodeService;
import kr.playground.jobs.vo.CodeVo;

@RestController
@RequestMapping("admin/common/code")
public class CodeController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private CodeService codeService;
	
	/** 목록 반환
	 * @param popupVo
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody	
	@RequestMapping(value="/list", method = RequestMethod.GET )
	public String list( CodeVo codeVo, HttpServletRequest request ) throws Exception {
		JSONObject rtnObject = new JSONObject();
		try {
			codeVo.setPageSize(15);
			codeVo.setStartNum(0);
			
			//long count = codeService.count(codeVo);
			List<CodeVo> list = codeService.list(codeVo);
			
			if ( list != null ) {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_SUCCESS);
				//rtnObject.put(JSONConstants.RESULT_COUNT, count);
				rtnObject.put(JSONConstants.RESULT_LIST, list);
			} else {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_ZERO);
			}
		} catch ( Exception e) {
			try {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_ERROR);
				rtnObject.put(JSONConstants.RESULT_MESSAGE, e.getMessage());
			} catch (JSONException e1) {
				
			}
			e.printStackTrace();
		}
		return rtnObject.toString();
	}
	
}
