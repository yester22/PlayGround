package kr.playground.jobs.controllers;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.playground.common.constants.JSONConstants;
import kr.playground.jobs.service.MenuService;
import kr.playground.jobs.vo.AdminMemberVo;
import kr.playground.jobs.vo.MenuVo;

@RestController
@RequestMapping("admin/common/menu")
public class MenuController {
	@Autowired
	private MenuService menuService;
	
	@ResponseBody	
	@RequestMapping(value="/list", method = RequestMethod.GET )
	public String getMyMenuList( ) throws Exception {
		JSONObject rtnObject = new JSONObject();
		try {
			Authentication authentication = SecurityContextHolder.getContext().getAuthentication(); 
			AdminMemberVo adm = (AdminMemberVo) authentication.getPrincipal();
 
			MenuVo vo = new MenuVo();
			vo.setMemberId(adm.getMemberId());
			
			List<MenuVo> list = menuService.getGranttedMenuList(vo);
			
			if ( list != null ) {
				rtnObject.put(JSONConstants.RESULT, JSONConstants.RESULT_SUCCESS);
				rtnObject.put(JSONConstants.RESULT_COUNT, ((list != null ) ? list.size() : 0));
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
