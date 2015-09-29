package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameProductVO;

/**
 * TODO 与成品的名字进行交互
 * @author Administrator
 * @since 2014年11月8日13:49:54
 */
public interface IFindNameProdDao {
	
	public List<NameProductVO> findAllNames() throws DAOException;

}
