package com.huawei_bp_it.nameSystem.action;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.UserPO;
import com.huawei_bp_it.nameSystem.service.ILoginService;
import com.huawei_bp_it.nameSystem.util.FactoryUtil;

/**
 * TODO µÇÂ¼Action
 * @author Administrator
 *
 */
public class LoginAction {
	
	private UserPO user;

	public UserPO getUser() {
		return user;
	}

	public void setUser(UserPO user) {
		this.user = user;
	}
	
	/**
	 * TODO µÇÂ¼Æ÷
	 * @param userPO
	 * @return
	 */
	public String login(){
		ILoginService iLoginService;
		try {
			iLoginService = (ILoginService) FactoryUtil.getClassInstance("LoginServiceImpl");
			if(iLoginService.login(user)){
				return "loginSucceed";
			}
		} catch (DAOException e) {
			e.printStackTrace();
		}
		return "loginFaild";
	}
	
	public String logout(){
		return "success";
	}

}
