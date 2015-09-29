package com.huawei_bp_it.nameSystem.action.nameCharAction;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.IModifyNameCharService;
import com.huawei_bp_it.nameSystem.service.impl.ModifyNameCharServiceImpl;

/**
 * TODO 创建名字
 * @author Administrator
 *
 */
public class CreateNameCharAction {
	
	//提供Gegger和Setter方法
	private NameCharacterVO nameCharacterVO;
	
	private IModifyNameCharService iModifyNameCharService = new ModifyNameCharServiceImpl();
	
	/**
	 * TODO 返回创建字jsp页面
	 * @return
	 */
	public String creating(){
		return "creating";
	}
	
	/**
	 * TODO 添加字成功返回页面
	 * @return
	 */
	public String addNameChar(){
		boolean flag = false;
		String returnPageString = "error";
		try {
			flag = iModifyNameCharService.addNameChar(nameCharacterVO);
		} catch (DAOException e) {
			e.printStackTrace();
		}
		if(flag){
			returnPageString = "createdSucceed";
		}else {
			returnPageString = "createdFaild";
		}
		return returnPageString;
	}

	public NameCharacterVO getNameCharacterVO() {
		return nameCharacterVO;
	}

	public void setNameCharacterVO(NameCharacterVO nameCharacterVO) {
		this.nameCharacterVO = nameCharacterVO;
	}
	
}
