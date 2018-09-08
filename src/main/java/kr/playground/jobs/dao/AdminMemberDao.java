package kr.playground.jobs.dao;

import org.apache.ibatis.annotations.Mapper;

import kr.playground.jobs.vo.AdminMemberVo;

@Mapper
public interface AdminMemberDao {
	public AdminMemberVo view(AdminMemberVo vo) throws Exception;
}
