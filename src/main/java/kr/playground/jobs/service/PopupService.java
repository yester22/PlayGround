package kr.playground.jobs.service;

import java.util.List;

import kr.playground.jobs.vo.PopupVo;

public interface PopupService {
	public PopupVo view(PopupVo vo) throws Exception;
	public List<PopupVo> list(PopupVo vo) throws Exception;
	public Integer count(PopupVo vo) throws Exception;
	public Integer update(PopupVo vo) throws Exception;
	public Integer delete(PopupVo vo) throws Exception;
	public void    insert(PopupVo vo) throws Exception;
}
