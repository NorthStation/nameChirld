package com.huawei_bp_it.nameSystem.pojo;

import java.io.Serializable;

/**
 * TODO µÇÂ¼ÓÃ»§
 * @author Administrator
 *
 */
public class UserPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8606432630635188837L;

	private long userId;
	
	private String userName;
	
	private String password;
	
	private String gender;
	
	private String idCard;
	
	public UserPO() {
		// TODO Auto-generated constructor stub
	}

	public UserPO(long userId, String userName, String password,
			String gender, String idCard) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.idCard = idCard;
	}

	@Override
	public String toString() {
		return "UserPO [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + ", gender=" + gender
				+ ", idCard=" + idCard + "]";
	}

	@Override
	public int hashCode() {
		int result = (int) userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPO other = (UserPO) obj;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (idCard == null) {
			if (other.idCard != null)
				return false;
		} else if (!idCard.equals(other.idCard))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
}
