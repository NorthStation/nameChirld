package com.huawei_bp_it.nameSystem.service.impl;

import java.util.List;

import com.huawei_bp_it.nameSystem.dao.IFindNameCharDao;
import com.huawei_bp_it.nameSystem.dao.IInsertNameCharDao;
import com.huawei_bp_it.nameSystem.dao.IModifyNameCharDao;
import com.huawei_bp_it.nameSystem.dao.impl.FindNameCharDaoImpl;
import com.huawei_bp_it.nameSystem.dao.impl.InsertNameCharDaoImpl;
import com.huawei_bp_it.nameSystem.dao.impl.ModifyNameCharDaoImpl;
import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.exception.NameCharExistsException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.IModifyNameCharService;

public class ModifyNameCharServiceImpl implements IModifyNameCharService {

	private IFindNameCharDao iFindNameCharDao = new FindNameCharDaoImpl();
	
	private IInsertNameCharDao	iInsertNameCharDao = new InsertNameCharDaoImpl();
	
	private IModifyNameCharDao iModifyNameCharDao = new ModifyNameCharDaoImpl();
	
	@Override
	public boolean addNameChar(NameCharacterVO nameCharacterVO) throws DAOException {
		/*List<NameCharacterVO> nameCharacterVOList = iFindNameCharDao.findConidtion2Char(nameCharacterVO);
		if(null != nameCharacterVOList && !nameCharacterVOList.isEmpty()){
			throw new NameCharExistsException();
		}*/
		boolean flag = iInsertNameCharDao.insertSingleChar(nameCharacterVO);
		return flag;
	}

	@Override
	public boolean modifyNameChar(NameCharacterVO nameCharacterVO) throws DAOException {
		boolean flag = iModifyNameCharDao.updateSingleCharInfo(nameCharacterVO);
		return flag;
	}

	@Override
	public boolean deleteNameChar(NameCharacterVO nameCharacterVO) throws DAOException {
		boolean flag = iModifyNameCharDao.deleteSingleNameChar(nameCharacterVO);
		return flag;
	}

}
