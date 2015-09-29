package com.huawei_bp_it.nameSystem.pojo;

import java.io.Serializable;

/**
 * TODO 名字常量
 * @author Administrator
 * @since 2014年11月4日22:28:27
 */
public class NameCharacterVO implements Serializable{
	
	/**
	 * 序列号
	 */
	private static final long serialVersionUID = 7381339577530926772L;
	
	/**
	 * 字符ID
	 */
	private int charId;
	
	/**
	 * 字的结构：即写法
	 */
	private String structure;
	
	/**
	 * 字的笔画数
	 */
	private Integer charNum;
	
	/**
	 * 适合：姓、名
	 */
	private String suitToName;
	
	/**
	 * 适合性别
	 */
	private String suitGender;
	
	/**
	 * 字的发音：韵律是平仄
	 */
	private String pronunciation;
	
	/**
	 * 五行富“……”
	 */
	private String richReligionary;
	
	/**
	 * 字表义
	 */
	private String charMeaning;
	
	/**
	 * 字引申义
	 */
	private String literalness;
	
	/**
	 * 引用诗句
	 */
	private String chaQuotation;
	
	/**
	 * 被长辈用过
	 */
	private String isUsedInElder;


	/**
	 * 无参构造
	 */
	public NameCharacterVO(){
		
	}
	
	/**
	 * TODO 有参构造
	 * @param charId
	 * @param structure
	 * @param charNum
	 * @param suitToName
	 * @param suitGender
	 * @param pronunciation
	 * @param richReligionary
	 * @param charMeaning
	 * @param literalness
	 * @param chaQuotation
	 * @param isUsedInElder
	 */
	public NameCharacterVO(int charId, String structure, Integer charNum,
			String suitToName, String suitGender, String pronunciation,
			String richReligionary, String charMeaning, String literalness,
			String chaQuotation, String isUsedInElder) {
		this.charId = charId;
		this.structure = structure;
		this.charNum = charNum;
		this.suitToName = suitToName;
		this.suitGender = suitGender;
		this.pronunciation = pronunciation;
		this.richReligionary = richReligionary;
		this.charMeaning = charMeaning;
		this.literalness = literalness;
		this.chaQuotation = chaQuotation;
		this.isUsedInElder = isUsedInElder;
	}
	
	public int getCharId() {
		return charId;
	}

	public void setCharId(int charId) {
		this.charId = charId;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Integer getCharNum() {
		return charNum;
	}

	public void setCharNum(Integer charNum) {
		this.charNum = charNum;
	}

	public String getSuitToName() {
		return suitToName;
	}

	public void setSuitToName(String suitToName) {
		this.suitToName = suitToName;
	}

	public String getSuitGender() {
		return suitGender;
	}

	public void setSuitGender(String suitGender) {
		this.suitGender = suitGender;
	}

	public String getPronunciation() {
		return pronunciation;
	}

	public void setPronunciation(String pronunciation) {
		this.pronunciation = pronunciation;
	}

	public String getRichReligionary() {
		return richReligionary;
	}

	public void setRichReligionary(String richReligionary) {
		this.richReligionary = richReligionary;
	}

	public String getCharMeaning() {
		return charMeaning;
	}

	public void setCharMeaning(String charMeaning) {
		this.charMeaning = charMeaning;
	}

	public String getLiteralness() {
		return literalness;
	}

	public void setLiteralness(String literalness) {
		this.literalness = literalness;
	}

	public String getChaQuotation() {
		return chaQuotation;
	}

	public void setChaQuotation(String chaQuotation) {
		this.chaQuotation = chaQuotation;
	}

	public String getIsUsedInElder() {
		return isUsedInElder;
	}

	public void setIsUsedInElder(String isUsedInElder) {
		this.isUsedInElder = isUsedInElder;
	}

	@Override
	public String toString() {
		return "NameCharacter [charId=" + charId + ", structure=" + structure
				+ ", charNum=" + charNum + ", suitToName=" + suitToName
				+ ", suitGender=" + suitGender + ", pronunciation="
				+ pronunciation + ", richReligionary=" + richReligionary
				+ ", charMeaning=" + charMeaning + ", literalness="
				+ literalness + ", chaQuotation=" + chaQuotation
				+ ", isUsedInElder=" + isUsedInElder + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((chaQuotation == null) ? 0 : chaQuotation.hashCode());
		result = prime * result + charId;
		result = prime * result
				+ ((charMeaning == null) ? 0 : charMeaning.hashCode());
		result = prime * result + ((charNum == null) ? 0 : charNum.hashCode());
		result = prime * result
				+ ((isUsedInElder == null) ? 0 : isUsedInElder.hashCode());
		result = prime * result
				+ ((literalness == null) ? 0 : literalness.hashCode());
		result = prime * result
				+ ((pronunciation == null) ? 0 : pronunciation.hashCode());
		result = prime * result
				+ ((richReligionary == null) ? 0 : richReligionary.hashCode());
		result = prime * result
				+ ((structure == null) ? 0 : structure.hashCode());
		result = prime * result
				+ ((suitGender == null) ? 0 : suitGender.hashCode());
		result = prime * result
				+ ((suitToName == null) ? 0 : suitToName.hashCode());
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
		NameCharacterVO other = (NameCharacterVO) obj;
		if (chaQuotation == null) {
			if (other.chaQuotation != null)
				return false;
		} else if (!chaQuotation.equals(other.chaQuotation))
			return false;
		if (charId != other.charId)
			return false;
		if (charMeaning == null) {
			if (other.charMeaning != null)
				return false;
		} else if (!charMeaning.equals(other.charMeaning))
			return false;
		if (charNum == null) {
			if (other.charNum != null)
				return false;
		} else if (!charNum.equals(other.charNum))
			return false;
		if (isUsedInElder == null) {
			if (other.isUsedInElder != null)
				return false;
		} else if (!isUsedInElder.equals(other.isUsedInElder))
			return false;
		if (literalness == null) {
			if (other.literalness != null)
				return false;
		} else if (!literalness.equals(other.literalness))
			return false;
		if (pronunciation == null) {
			if (other.pronunciation != null)
				return false;
		} else if (!pronunciation.equals(other.pronunciation))
			return false;
		if (richReligionary == null) {
			if (other.richReligionary != null)
				return false;
		} else if (!richReligionary.equals(other.richReligionary))
			return false;
		if (structure == null) {
			if (other.structure != null)
				return false;
		} else if (!structure.equals(other.structure))
			return false;
		if (suitGender == null) {
			if (other.suitGender != null)
				return false;
		} else if (!suitGender.equals(other.suitGender))
			return false;
		if (suitToName == null) {
			if (other.suitToName != null)
				return false;
		} else if (!suitToName.equals(other.suitToName))
			return false;
		return true;
	}
}
