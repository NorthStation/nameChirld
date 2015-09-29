package com.huawei_bp_it.nameSystem.action.nameCharAction;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.service.IFindNameCharService;
import com.huawei_bp_it.nameSystem.service.impl.FindNameCharServiceImpl;
import com.huawei_bp_it.nameSystem.util.FactoryUtil;
import com.opensymphony.xwork2.ActionContext;


/**
 * TODO 取得名字
 * @author Administrator
 * @since 2014年11月13日22:26:12
 */
public class GainNameCharAction{
	
	private List<NameCharacterVO> nameChsList ;
	
	/**
	 * 通过工厂得到对象
	 * @return
	 * @throws DAOException
	 */
	public FindNameCharServiceImpl getFindNameCharServiceImpl() throws DAOException{
		FindNameCharServiceImpl iFindNameCharService = (FindNameCharServiceImpl) FactoryUtil.getClassInstance("FindNameCharServiceImpl");
		return iFindNameCharService;
	}
	
	/**
	 * TODO 查询出所有的名字
	 * @author Administrator
	 * @return
	 */
	public String getAllNameList(){
		String result = "allNameList";
		try {
			IFindNameCharService iFindNameCharService = this.getFindNameCharServiceImpl();
			nameChsList = iFindNameCharService.findAllNameChars();
			ActionContext.getContext().put("nameChsList", nameChsList);
			yesString = "LOVE";
			result = "allNameList";
		} catch (DAOException e) {
			e.printStackTrace();
			result = "error";
		}
		return result;
	}

	public List<NameCharacterVO> getNameChs() {
		return nameChsList;
	}

	public void setNameChs(List<NameCharacterVO> nameChsList) {
		this.nameChsList = nameChsList;
	}
	
	public String getYesString() {
		return yesString;
	}

	public void setYesString(String yesString) {
		this.yesString = yesString;
	}

	private String yesString ; 

}
