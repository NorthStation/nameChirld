package com.huawei_bp_it.nameSystem.service;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO 查询所有的待组成名字的字集
 * @author Administrator
 * @since 2014年11月5日21:07:09
 */
public interface IFindNameCharService {
	
	public List<NameCharacterVO> findAllNameChars()throws DAOException ;
}
