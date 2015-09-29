package com.huawei_bp_it.nameSystem.pojo;

import java.io.Serializable;

/**
 * TODO ���ֲ�Ʒ
 * @author Administrator
 * @since 2014-11-4 23:13:36
 */
public class NameProductVO implements Serializable{

	/**
	 * �������к�
	 */
	private static final long serialVersionUID = -2962859336639904737L;
	
	/**
	 * ����Id
	 */
	private int nameId;
	
	/**
	 * ����
	 */
	private String name;
	
	/**
	 * �ʺ��С�Ů
	 */
	private String genderName;
	
	/**
	 * ���ֱʻ���
	 */
	private Integer nameCount;
	
	/**
	 * �ָ���
	 */
	private String nameNum;
	
	/**
	 * ���ַ�������ƽ��
	 */
	private String pronunciation;
	
	/**
	 * ���и��� 
	 */
	private String richRiligionary;
	
	/**
	 * �Ƿ����ֱ������ù�
	 */
	private String charIsUsedElder;
	
	/**
	 * ��������
	 */
	private String nameQuetation;
	
	/**
	 * ���ֺ���
	 */
	private String nameMeaning;
	
	/**
	 * ���ֵ����ӵȼ�
	 */
	private String nameGrade;

	public int getNameId() {
		return nameId;
	}

	public void setNameId(int nameId) {
		this.nameId = nameId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	public Integer getNameCount() {
		return nameCount;
	}

	public void setNameCount(Integer nameCount) {
		this.nameCount = nameCount;
	}

	public String getNameNum() {
		return nameNum;
	}

	public void setNameNum(String nameNum) {
		this.nameNum = nameNum;
	}

	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

	public String getRichRiligionary() {
		return richRiligionary;
	}

	public void setRichRiligionary(String richRiligionary) {
		this.richRiligionary = richRiligionary;
	}

	public String getCharIsUsedElder() {
		return charIsUsedElder;
	}

	public void setCharIsUsedElder(String charIsUsedElder) {
		this.charIsUsedElder = charIsUsedElder;
	}

	public String getNameQuetation() {
		return nameQuetation;
	}

	public void setNameQuetation(String nameQuetation) {
		this.nameQuetation = nameQuetation;
	}

	public String getNameMeaning() {
		return nameMeaning;
	}

	public void setNameMeaning(String nameMeaning) {
		this.nameMeaning = nameMeaning;
	}

	public String getNameGrade() {
		return nameGrade;
	}

	public void setNameGrade(String nameGrade) {
		this.nameGrade = nameGrade;
	}

	public NameProductVO() {
	}

	public NameProductVO(int nameId, String name, String genderName,
			Integer nameCount, String nameNum, String pronunciation,
			String richRiligionary, String charIsUsedElder,
			String nameQuetation, String nameMeaning, String nameGrade) {
		super();
		this.nameId = nameId;
		this.name = name;
		this.genderName = genderName;
		this.nameCount = nameCount;
		this.nameNum = nameNum;
		this.pronunciation = pronunciation;
		this.richRiligionary = richRiligionary;
		this.charIsUsedElder = charIsUsedElder;
		this.nameQuetation = nameQuetation;
		this.nameMeaning = nameMeaning;
		this.nameGrade = nameGrade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((charIsUsedElder == null) ? 0 : charIsUsedElder.hashCode());
		result = prime * result
				+ ((genderName == null) ? 0 : genderName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((nameCount == null) ? 0 : nameCount.hashCode());
		result = prime * result
				+ ((nameGrade == null) ? 0 : nameGrade.hashCode());
		result = prime * result + nameId;
		result = prime * result
				+ ((nameMeaning == null) ? 0 : nameMeaning.hashCode());
		result = prime * result + ((nameNum == null) ? 0 : nameNum.hashCode());
		result = prime * result
				+ ((nameQuetation == null) ? 0 : nameQuetation.hashCode());
		result = prime * result
				+ ((pronunciation == null) ? 0 : pronunciation.hashCode());
		result = prime * result
				+ ((richRiligionary == null) ? 0 : richRiligionary.hashCode());
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
		NameProductVO other = (NameProductVO) obj;
		if (charIsUsedElder == null) {
			if (other.charIsUsedElder != null)
				return false;
		} else if (!charIsUsedElder.equals(other.charIsUsedElder))
			return false;
		if (genderName == null) {
			if (other.genderName != null)
				return false;
		} else if (!genderName.equals(other.genderName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nameCount == null) {
			if (other.nameCount != null)
				return false;
		} else if (!nameCount.equals(other.nameCount))
			return false;
		if (nameGrade == null) {
			if (other.nameGrade != null)
				return false;
		} else if (!nameGrade.equals(other.nameGrade))
			return false;
		if (nameId != other.nameId)
			return false;
		if (nameMeaning == null) {
			if (other.nameMeaning != null)
				return false;
		} else if (!nameMeaning.equals(other.nameMeaning))
			return false;
		if (nameNum == null) {
			if (other.nameNum != null)
				return false;
		} else if (!nameNum.equals(other.nameNum))
			return false;
		if (nameQuetation == null) {
			if (other.nameQuetation != null)
				return false;
		} else if (!nameQuetation.equals(other.nameQuetation))
			return false;
		if (pronunciation == null) {
			if (other.pronunciation != null)
				return false;
		} else if (!pronunciation.equals(other.pronunciation))
			return false;
		if (richRiligionary == null) {
			if (other.richRiligionary != null)
				return false;
		} else if (!richRiligionary.equals(other.richRiligionary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NameProduct [nameId=" + nameId + ", name=" + name
				+ ", genderName=" + genderName + ", nameCount=" + nameCount
				+ ", nameNum=" + nameNum + ", pronunciation=" + pronunciation
				+ ", richRiligionary=" + richRiligionary + ", charIsUsedElder="
				+ charIsUsedElder + ", nameQuetation=" + nameQuetation
				+ ", nameMeaning=" + nameMeaning + ", nameGrade=" + nameGrade
				+ "]";
	}
}
