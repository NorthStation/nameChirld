package com.huawei_bp_it.nameSystem.service;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

public interface IModifyNameCharService {
	
	public boolean addNameChar(NameCharacterVO nameCharacterVO) throws DAOException ;
	
	public boolean modifyNameChar(NameCharacterVO nameCharacterVO) throws DAOException ;
	
	public boolean deleteNameChar(NameCharacterVO nameCharacterVO) throws DAOException ;
	
}
