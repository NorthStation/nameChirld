package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO 插入新记录：新的名
 * @author Administrator
 * @since 2014年11月13日20:28:10
 */
public interface IInsertNameCharDao {

	/**
	 * TODO 插入单个字
	 * @param nameChar
	 * @return
	 * @throws DAOException
	 */
	public boolean insertSingleChar(NameCharacterVO nameChar) throws DAOException;
	
	/**
	 * TODO 批量添加字
	 * @param chars
	 * @return
	 * @throws DAOException
	 */
	public boolean insertMultiChar(List<NameCharacterVO> chars) throws DAOException;
}
