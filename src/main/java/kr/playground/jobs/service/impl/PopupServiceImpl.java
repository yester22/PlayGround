package kr.playground.jobs.service.impl;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.playground.jobs.dao.PopupDao;
import kr.playground.jobs.service.PopupService;
import kr.playground.jobs.vo.PopupVo;

/**
 * @author kyoungjin
 *
 */
@Service
public class PopupServiceImpl implements PopupService {

	private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private PopupDao popupDao;
	

	@Override
	public PopupVo view(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " view");
		return popupDao.view(vo);
	}

	@Override
	public List<PopupVo> list(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " list");
		return popupDao.list(vo);
	}

	@Override
	public Integer count(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " count");
		return popupDao.count(vo);
	}

	@Override
    @Transactional
	public Integer update(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " update");
		return popupDao.update(vo);
	}

	@Override
    @Transactional
	public Integer delete(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " delete");
		return popupDao.delete(vo);
	}

	@Override
    @Transactional
	public void insert(PopupVo vo) throws Exception {
		log.debug( this.getClass().toString() + " insert");
		popupDao.insert(vo);
	}
	
	
}
