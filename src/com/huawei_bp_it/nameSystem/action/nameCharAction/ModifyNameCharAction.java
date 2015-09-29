package com.huawei_bp_it.nameSystem.action.nameCharAction;

import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

public class ModifyNameCharAction {
	
	private NameCharacterVO nameCharacterVO;
	
	/**
	 * TODO 修改字
	 * @return
	 */
	public String modifyPage(){
		return "modifyNameChar";
	}
	
	/**
	 * TODO 修改文字请求
	 * @return
	 */
	public String modifyNameChar(){
		boolean flag = false;
		String msg = "error";
		if(!flag){
			msg = "modifySucceed";
		}else {
			msg = "modifyFailed";
		}
		return msg;
	}

	public NameCharacterVO getNameCharacterVO() {
		return nameCharacterVO;
	}

	public void setNameCharacterVO(NameCharacterVO nameCharacterVO) {
		this.nameCharacterVO = nameCharacterVO;
	}

}
