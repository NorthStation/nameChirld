package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO 查询待取名的字
 * @author Administrator
 * @since 2014年11月5日21:10:39
 */
public interface IFindNameCharDao {
	
	/**
	 * TODO 查询所有的字
	 * @return
	 * @throws DAOException 
	 */
	public List<NameCharacterVO> findAllNameChars() throws DAOException;
	
	/**
	 * TODO 查询指定笔画下的所有字
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNumChar(int charCount) throws DAOException;
	
	/**
	 * TODO 查询出指定性别下的字
	 * @param gender
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionGenderChar(String gender) throws DAOException;
	
	/**
	 * TOD 查询出指定姓/名下的所有的字
	 * @param sutiToName
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNameChar(String sutiToName) throws DAOException;
	
	/**
	 * TODO 指定五行下的字
	 * @param religionary
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionReligionaryChar(String religionary) throws DAOException;

	/**
	 * TODO 指定发音下的字
	 * @param pronunciation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionPronunciationChar(String pronunciation) throws DAOException;

	/**
	 * TODO 查询出长辈是否已使用过的字
	 * @param is_used_elder
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionUsedChar(String is_used_elder) throws DAOException;

	/**
	 * TODO 包含含义下的字
	 * @param meaning
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionMeaningChar(String meaning) throws DAOException;

	/**
	 * TODO 包含引用下的字
	 * @param quotation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionQueattionChar(String quotation) throws DAOException;
	
	/**
	 * TODO 查询指定条件下的字
	 * @param charNum
	 * @param suitToName
	 * @param suitGender
	 * @param pronunciation
	 * @param literalnes
	 * @param quotation
	 * @param meaning
	 * @param religionary
	 * @param isUsedElder
	 * @return
	 * @throws DAOException
	 **/
	public List<NameCharacterVO> findConidtionChar(int charNum ,String suitToName, String suitGender,
			String pronunciation,String literalnes,String quotation,String meaning,
			String religionary,String isUsedElder) throws DAOException;
	
	/**
	 * TODO 查询指定条件下的字
	 * @param nameCharacterVO
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtion2Char(NameCharacterVO nameCharacterVO) throws DAOException;
	
}
