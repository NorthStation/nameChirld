package com.winnermedical.it.validatecode.action;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Administrator
 *
 */
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 用户名
	private String userName;
	// 密码
	private String password;
	// 验证码
	private String code;
	private InputStream inputStream;

	public InputStream getResult() {
		return inputStream;
	}

	// 成功
	public String success() throws Exception {
		return SUCCESS;
	}

	// 测试登录
	public String testLogin() throws Exception {
		// 获取图片的验证码
		String randomStr = (String) ActionContext.getContext().getSession().get("randomStr");
		if (code.trim().equalsIgnoreCase(randomStr)) {
			if ("admin".equals(userName.trim()) && "admin".equals(password.trim())) {
				// 成功
				inputStream = new ByteArrayInputStream("1".getBytes("UTF-8"));
			} else {
				// 用户名或密码错误
				inputStream = new ByteArrayInputStream("2".getBytes("UTF-8"));
			}
		} else {
			// 验证码错误
			inputStream = new ByteArrayInputStream("0".getBytes("UTF-8"));
		}
		return "result";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}