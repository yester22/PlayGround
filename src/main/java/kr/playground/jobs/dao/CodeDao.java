package kr.playground.jobs.dao;

import java.util.List;

import kr.playground.jobs.vo.CodeVo;

public interface CodeDao {
	public CodeVo view(CodeVo vo)  throws Exception;
	public List<CodeVo> list(CodeVo vo)  throws Exception;
	public Integer count(CodeVo vo) throws Exception;
	public Integer update(CodeVo vo) throws Exception;
	public Integer delete(CodeVo vo) throws Exception;
	public void    insert(CodeVo vo) throws Exception;
}
