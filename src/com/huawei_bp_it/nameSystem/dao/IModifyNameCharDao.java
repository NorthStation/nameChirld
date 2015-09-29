package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO �޸�����
 * 
 * @author Administrator
 * @since 2014��11��13��21:07:14
 */
public interface IModifyNameCharDao {

	/**
	 * TODO �����޸�
	 * 
	 * @param characterVO
	 * @return
	 * @throws DAOException
	 */
	public boolean updateSingleCharInfo(NameCharacterVO characterVO) throws DAOException;

	/**
	 * TODO �����޸�����
	 * 
	 * @param characterVOs
	 * @return
	 * @throws DAOException
	 */
	public boolean updateMultiCharInfo(List<NameCharacterVO> characterVOs) throws DAOException;

	/**
	 * ɾ��һ������
	 * 
	 * @param nameCharacterVO
	 * @return
	 */
	public boolean deleteSingleNameChar(NameCharacterVO nameCharacterVO) throws DAOException;
}
