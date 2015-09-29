package com.huawei_bp_it.nameSystem.service.impl;

import com.huawei_bp_it.nameSystem.pojo.UserPO;
import com.huawei_bp_it.nameSystem.service.ILoginService;

/**
 * TODO µ«¬º¥¶¿Ì¿‡
 * @author Administrator
 *
 */
public class LoginServiceImpl implements ILoginService {

	@Override
	public boolean login(UserPO userPO) {
		boolean res = false;
		if(null != userPO){
			String name = userPO.getUserName();
			String pwd = userPO.getPassword();
			if("admin".equals(name)){
				if("admin".equals(pwd)){
					res = true;
				}else {
					
				}
			}
		}
		return res;
	}

}
