package kr.playground.jobs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.playground.jobs.vo.CodeVo;

@Mapper
public interface CodeDao {
	public List<CodeVo> list(CodeVo vo) throws Exception;
	public CodeVo view(CodeVo vo) throws Exception;
	public long count(CodeVo vo) throws Exception;
}
