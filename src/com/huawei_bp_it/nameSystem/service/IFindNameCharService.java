package com.huawei_bp_it.nameSystem.service;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO ��ѯ���еĴ�������ֵ��ּ�
 * @author Administrator
 * @since 2014��11��5��21:07:09
 */
public interface IFindNameCharService {
	
	public List<NameCharacterVO> findAllNameChars()throws DAOException ;
}
