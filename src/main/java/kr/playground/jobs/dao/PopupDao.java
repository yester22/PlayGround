package kr.playground.jobs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.playground.jobs.vo.PopupVo;

@Mapper
public interface PopupDao {
	public PopupVo view(PopupVo vo)  throws Exception;
	public List<PopupVo> list(PopupVo vo)  throws Exception;
	public Integer count(PopupVo vo) throws Exception;
	public Integer update(PopupVo vo) throws Exception;
	public Integer delete(PopupVo vo) throws Exception;
	public void    insert(PopupVo vo) throws Exception;
	
}
