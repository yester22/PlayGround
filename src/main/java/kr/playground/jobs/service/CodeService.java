package kr.playground.jobs.service;

import java.util.List;

import kr.playground.jobs.vo.CodeVo;

public interface CodeService {
	public List<CodeVo> list(CodeVo codeVo) throws Exception;
	public long count(CodeVo vo) throws Exception;
}
