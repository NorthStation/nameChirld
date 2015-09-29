package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO �����¼�¼���µ���
 * @author Administrator
 * @since 2014��11��13��20:28:10
 */
public interface IInsertNameCharDao {

	/**
	 * TODO ���뵥����
	 * @param nameChar
	 * @return
	 * @throws DAOException
	 */
	public boolean insertSingleChar(NameCharacterVO nameChar) throws DAOException;
	
	/**
	 * TODO ���������
	 * @param chars
	 * @return
	 * @throws DAOException
	 */
	public boolean insertMultiChar(List<NameCharacterVO> chars) throws DAOException;
}
