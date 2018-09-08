package kr.playground.jobs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.playground.jobs.dao.MenuDao;
import kr.playground.jobs.service.MenuService;
import kr.playground.jobs.vo.MenuVo;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuDao menuDao;

	/**
	 * @Method Name  : getGranttedMenuList
	 * @작성일   : 2018-08-17 
	 * @작성자   : 정경진
	 * @변경이력     :
	 * @Method 설명  : 사용자 메뉴 목록 반환
	 * @param menuVo
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MenuVo> getGranttedMenuList(MenuVo menuVo) throws Exception {
		return menuDao.getGranttedMenuList(menuVo);
	}

}
