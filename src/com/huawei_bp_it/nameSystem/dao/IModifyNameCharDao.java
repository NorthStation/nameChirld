package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO 修改文字
 * 
 * @author Administrator
 * @since 2014年11月13日21:07:14
 */
public interface IModifyNameCharDao {

	/**
	 * TODO 单个修改
	 * 
	 * @param characterVO
	 * @return
	 * @throws DAOException
	 */
	public boolean updateSingleCharInfo(NameCharacterVO characterVO) throws DAOException;

	/**
	 * TODO 批量修改文字
	 * 
	 * @param characterVOs
	 * @return
	 * @throws DAOException
	 */
	public boolean updateMultiCharInfo(List<NameCharacterVO> characterVOs) throws DAOException;

	/**
	 * 删除一个文字
	 * 
	 * @param nameCharacterVO
	 * @return
	 */
	public boolean deleteSingleNameChar(NameCharacterVO nameCharacterVO) throws DAOException;
}
