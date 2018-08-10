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
import kr.playground.jobs.service.PopupService;
import kr.playground.jobs.vo.PopupVo;

@RestController
@RequestMapping("admin/popup")
public class PopupController {
	@Autowired
	private PopupService popupService;
	
	private Log log = LogFactory.getLog(this.getClass());
	
	/** 목록 반환
	 * @param popupVo
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ResponseBody	
	@RequestMapping(value="/list", method = RequestMethod.GET )
	public String list( PopupVo popupVo, HttpServletRequest request ) throws Exception {
		JSONObject rtnObject = new JSONObject();
		try {
			popupVo.setPageSize(15);
			popupVo.setStartNum(0);
			
			int count = popupService.count(popupVo);
			List<PopupVo> list = popupService.list(popupVo);
			
			if ( list != null ) {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_SUCCESS);
				rtnObject.put(JSONConstants.RESULT_COUNT, count);
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

	
	/** 단일 오브젝트 반환
	 * @param popupVo
	 * @param request
	 * @return
	 */
	@ResponseBody	
	@RequestMapping(value="/view", method = RequestMethod.POST )
	public String view( PopupVo popupVo, HttpServletRequest request ) {
		JSONObject rtnObject = new JSONObject();
		try {
			PopupVo vo = popupService.view(popupVo);
			
			log.debug(vo);
			
			if ( vo != null ) {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_SUCCESS);
				rtnObject.put(JSONConstants.RESULT_OBJECT, vo);
			} else {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_ZERO);
			}
		} catch ( Exception e) {
			try {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_ERROR);
				rtnObject.put(JSONConstants.RESULT_MESSAGE, e.getMessage());
			} catch (JSONException e1) {
				
			}
		}
		return rtnObject.toString();
	}
	
}
