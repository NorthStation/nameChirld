package com.huawei_bp_it.nameSystem.service.impl;

import java.util.List;

import com.huawei_bp_it.nameSystem.dao.IFindNameCharDao;
import com.huawei_bp_it.nameSystem.dao.impl.FindNameCharDaoImpl;
import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.IFindNameCharService;


public class FindNameCharServiceImpl implements IFindNameCharService {
	
	IFindNameCharDao iFindNameCharDao = new FindNameCharDaoImpl();

	@Override
	public List<NameCharacterVO> findAllNameChars() throws DAOException {
		List<NameCharacterVO> list = iFindNameCharDao.findAllNameChars();
		return list;
	}

	
}
