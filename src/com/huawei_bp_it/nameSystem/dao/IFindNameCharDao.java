package com.huawei_bp_it.nameSystem.dao;

import java.util.List;

import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO ��ѯ��ȡ������
 * @author Administrator
 * @since 2014��11��5��21:10:39
 */
public interface IFindNameCharDao {
	
	/**
	 * TODO ��ѯ���е���
	 * @return
	 * @throws DAOException 
	 */
	public List<NameCharacterVO> findAllNameChars() throws DAOException;
	
	/**
	 * TODO ��ѯָ���ʻ��µ�������
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNumChar(int charCount) throws DAOException;
	
	/**
	 * TODO ��ѯ��ָ���Ա��µ���
	 * @param gender
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionGenderChar(String gender) throws DAOException;
	
	/**
	 * TOD ��ѯ��ָ����/���µ����е���
	 * @param sutiToName
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNameChar(String sutiToName) throws DAOException;
	
	/**
	 * TODO ָ�������µ���
	 * @param religionary
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionReligionaryChar(String religionary) throws DAOException;

	/**
	 * TODO ָ�������µ���
	 * @param pronunciation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionPronunciationChar(String pronunciation) throws DAOException;

	/**
	 * TODO ��ѯ�������Ƿ���ʹ�ù�����
	 * @param is_used_elder
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionUsedChar(String is_used_elder) throws DAOException;

	/**
	 * TODO ���������µ���
	 * @param meaning
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionMeaningChar(String meaning) throws DAOException;

	/**
	 * TODO ���������µ���
	 * @param quotation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionQueattionChar(String quotation) throws DAOException;
	
	/**
	 * TODO ��ѯָ�������µ���
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
	 * TODO ��ѯָ�������µ���
	 * @param nameCharacterVO
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtion2Char(NameCharacterVO nameCharacterVO) throws DAOException;
	
}
