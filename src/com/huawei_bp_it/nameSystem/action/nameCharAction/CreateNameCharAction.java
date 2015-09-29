package com.huawei_bp_it.nameSystem.action.nameCharAction;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.IModifyNameCharService;
import com.huawei_bp_it.nameSystem.service.impl.ModifyNameCharServiceImpl;

/**
 * TODO ��������
 * @author Administrator
 *
 */
public class CreateNameCharAction {
	
	//�ṩGegger��Setter����
	private NameCharacterVO nameCharacterVO;
	
	private IModifyNameCharService iModifyNameCharService = new ModifyNameCharServiceImpl();
	
	/**
	 * TODO ���ش�����jspҳ��
	 * @return
	 */
	public String creating(){
		return "creating";
	}
	
	/**
	 * TODO ����ֳɹ�����ҳ��
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
