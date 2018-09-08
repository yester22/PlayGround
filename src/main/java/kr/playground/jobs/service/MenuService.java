package kr.playground.jobs.service;

import java.util.List;

import kr.playground.jobs.vo.MenuVo;

public interface MenuService {
	public List<MenuVo> getGranttedMenuList(MenuVo menuVo) throws Exception;
}
