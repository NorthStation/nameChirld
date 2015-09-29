package com.huawei_bp_it.nameSystem.action;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.impl.FindNameCharServiceImpl;

public class FindNameView {

	public static void main(String[] args) throws DAOException {
		FindNameCharServiceImpl findNameCharServiceImpl = new FindNameCharServiceImpl();
		List<NameCharacterVO> list = findNameCharServiceImpl.findAllNameChars();
		for (NameCharacterVO nameCharacterVO : list) {
			System.out.println(nameCharacterVO.getStructure());
		}
	}
}
