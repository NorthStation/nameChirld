package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameProductVO;

/**
 * TODO ���Ʒ�����ֽ��н���
 * @author Administrator
 * @since 2014��11��8��13:49:54
 */
public interface IFindNameProdDao {
	
	public List<NameProductVO> findAllNames() throws DAOException;

}
