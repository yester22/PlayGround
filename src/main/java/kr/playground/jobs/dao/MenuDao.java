package kr.playground.jobs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.playground.jobs.vo.MenuVo;

@Mapper
public interface MenuDao {
	public List<MenuVo> getGranttedMenuList(MenuVo menuVo) throws Exception;
}
