package kr.playground.jobs.service.impl;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.playground.jobs.dao.CodeDao;
import kr.playground.jobs.service.CodeService;
import kr.playground.jobs.vo.CodeVo;

@Service
public class CodeServiceImpl implements CodeService {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private CodeDao codedao;
	
	@Override
	public List<CodeVo> list(CodeVo vo) throws Exception {
		return codedao.list(vo);
	}

	@Override
	public long count(CodeVo vo) throws Exception {
		return codedao.count(vo);
	}

}
