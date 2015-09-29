package com.huawei_bp_it.nameSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huawei_bp_it.nameSystem.dao.IFindNameCharDao;
import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.util.ConnectionUtil;
import com.huawei_bp_it.nameSystem.util.QueryUtil;

/**
 * TODO Dao层实现类
 * @author Administrator
 * 查询字
 */
public class FindNameCharDaoImpl implements IFindNameCharDao{
	
	/**
	 * TODO 查询所有的字
	 * @return
	 * @throws DAOException 
	 */
	public List<NameCharacterVO> findAllNameChars() throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t";
			pstmt = connection.prepareStatement(sql);
			rs = pstmt.executeQuery();
			/*while(rs.next()){
				ch = new NameCharacterVO();
				ch.setCharId(rs.getInt("id"));
				ch.setStructure(rs.getString("structure"));
				ch.setCharNum(rs.getInt("char_num"));
				ch.setSuitToName(rs.getString("suit_to_name"));
				ch.setSuitGender(rs.getString("suit_to_gener"));
				ch.setPronunciation(rs.getString("pronunciation"));
				ch.setRichReligionary(rs.getString("literalness"));
				ch.setCharMeaning(rs.getString("meaning"));
				ch.setLiteralness(rs.getString("literalness"));
				ch.setChaQuotation(rs.getString("quotation"));
				ch.setIsUsedInElder(rs.getString("is_used_elder"));
				
				charsList.add(ch);
			}*/
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
	/**
	 * TODO 查询指定笔画下的所有字
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNumChar(int charCount) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.char_num = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(0, charCount);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
	/**
	 * TODO 查询出指定性别下的字
	 * @param gender
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionGenderChar(String gender) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.suit_to_gener = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, gender);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
	/**
	 * TOD 查询出指定姓/名下的所有的字
	 * @param sutiToName
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionNameChar(String sutiToName) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.suit_to_name = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, sutiToName);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
	/**
	 * TODO 指定五行下的字
	 * @param religionary
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionReligionaryChar(String religionary) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.religionary = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, religionary);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}

	/**
	 * TODO 指定发音下的字
	 * @param pronunciation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionPronunciationChar(String pronunciation) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.pronunciation = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, pronunciation);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}

	/**
	 * TODO 查询出长辈是否已使用过的字
	 * @param is_used_elder
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionUsedChar(String is_used_elder) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where nc.is_used_elder = ?";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, is_used_elder);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}

	/**
	 * TODO 包含含义下的字
	 * @param meaning
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionMeaningChar(String meaning) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where lower(nc.is_used_elder) like '%'||lower(?)||'%'";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, meaning);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}

	/**
	 * TODO 包含引用下的字
	 * @param quotation
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtionQueattionChar(String quotation) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "select * from name_character_t nc where lower(nc.quotation) like '%'||lower(?)||'%'";
			pstmt = connection.prepareStatement(sql);
			pstmt.setString(0, quotation);
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
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
			String religionary,String isUsedElder) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int index = 0 ;
		
		int charNumIndex = -1;
		int suitToNameIndex = -1;
		int suitGenderIndex = -1;
		int pronunciationIndex = -1;
		int literalnesIndex = -1;
		int quotationIndex = -1;
		int meaningIndex = -1;
		int religionaryIndex = -1;
		int isUsedElderIndex = -1;
		try {
			connection = ConnectionUtil.getConnection();
			String sqlBasic = "select nct.* from name_character_t nct";
			if(charNum!=0|| null != suitToName|| null != suitGender|| null != pronunciation|| null != literalnes
					|| null != quotation|| null != meaning|| null != religionary|| null != isUsedElder){
				sql = sqlBasic + "where";
				if(charNum != 0){
					sql = sql + "nct.char_num = ?";
					charNumIndex = index ;
					index++;
				}else  if(suitToName != null){
					sql = sql + "nct.suit_to_name = ?";
					suitToNameIndex = index ;
					index++;
				}else if (suitGender != null) {
					sql = sql + "nct.suit_gender = ?";
					suitGenderIndex = index ;
					index++;
				}else if (pronunciation != null) {
					sql = sql + "nct.pronunciation = ?";
					pronunciationIndex = index ;
					index++;
				}else if (literalnes != null) {
					sql = sql + "nct.literalness = ?";
					literalnesIndex = index ;
					index++;
				}else if (quotation != null) {
					sql = sql + "nct.quotation = ?";
					quotationIndex = index ;
					index++;
				}else if (meaning != null) {
					sql = sql + "nct.meaning = ?";
					meaningIndex = index ;
					index++;
				}else if (religionary != null) {
					sql = sql + "nct.religionary = ?";
					religionaryIndex = index ;
					index++;
				}else if (isUsedElder != null) {
					sql = sql + "nct.is_used_elder = ?";
					isUsedElderIndex = index ;
					index++;
				}else {
				}
			}
			
			pstmt = connection.prepareStatement(sql);
			
			if(charNum!=0|| null != suitToName|| null != suitGender|| null != pronunciation|| null != literalnes
					|| null != quotation|| null != meaning|| null != religionary|| null != isUsedElder){
				if(charNum != 0){
					pstmt.setInt(charNumIndex, charNum);
				}else  if(suitToName != null){
					pstmt.setString(suitToNameIndex, suitToName);
				}else if (suitGender != null) {
					pstmt.setString(suitGenderIndex, suitGender);
				}else if (pronunciation != null) {
					pstmt.setString(pronunciationIndex, pronunciation);
				}else if (literalnes != null) {
					pstmt.setString(literalnesIndex, literalnes);
				}else if (quotation != null) {
					pstmt.setString(quotationIndex, quotation);
				}else if (meaning != null) {
					pstmt.setString(meaningIndex, meaning);
				}else if (religionary != null) {
					pstmt.setString(religionaryIndex, religionary);
				}else if (isUsedElder != null) {
					pstmt.setString(isUsedElderIndex, isUsedElder);
				}else {
				}
			}
			
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
	
	/**
	 * TODO 查询指定条件下的字
	 * @param nameCharacterVO
	 * @return
	 * @throws DAOException
	 */
	public List<NameCharacterVO> findConidtion2Char(NameCharacterVO nameCharacterVO) throws DAOException{
		List<NameCharacterVO> charsList = new ArrayList<NameCharacterVO>();
		Connection connection = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String sqlBasic = "select nct.* from name_character_t nct";
		int index = 0 ;
		
		int charNumIndex = -1;
		int suitToNameIndex = -1;
		int suitGenderIndex = -1;
		int pronunciationIndex = -1;
		int literalnesIndex = -1;
		int quotationIndex = -1;
		int meaningIndex = -1;
		int religionaryIndex = -1;
		int isUsedElderIndex = -1;
		try {
			connection = ConnectionUtil.getConnection();
			
			if(null != nameCharacterVO){
				sql = sqlBasic + "where";
				if(nameCharacterVO.getCharNum() != 0){
					sql = sql + "nct.char_num = ?";
					charNumIndex = index ;
					index++;
				}else  if(nameCharacterVO.getSuitToName() != null){
					sql = sql + "nct.suit_to_name = ?";
					suitToNameIndex = index ;
					index++;
				}else if (nameCharacterVO.getSuitGender() != null) {
					sql = sql + "nct.suit_gender = ?";
					suitGenderIndex = index ;
					index++;
				}else if (nameCharacterVO.getPronunciation() != null) {
					sql = sql + "nct.pronunciation = ?";
					pronunciationIndex = index ;
					index++;
				}else if (nameCharacterVO.getLiteralness() != null) {
					sql = sql + "nct.literalness = ?";
					literalnesIndex = index ;
					index++;
				}else if (nameCharacterVO.getChaQuotation() != null) {
					sql = sql + "nct.quotation = ?";
					quotationIndex = index ;
					index++;
				}else if (nameCharacterVO.getCharMeaning() != null) {
					sql = sql + "nct.meaning = ?";
					meaningIndex = index ;
					index++;
				}else if (nameCharacterVO.getRichReligionary() != null) {
					sql = sql + "nct.religionary = ?";
					religionaryIndex = index ;
					index++;
				}else if (nameCharacterVO.getIsUsedInElder() != null) {
					sql = sql + "nct.is_used_elder = ?";
					isUsedElderIndex = index ;
					index++;
				}else {
					
				}
			}
			pstmt = connection.prepareStatement(sql);
			
			if(null != nameCharacterVO){
				if(nameCharacterVO.getCharNum() != 0){
					pstmt.setInt(charNumIndex, nameCharacterVO.getCharNum());
				}else  if(nameCharacterVO.getSuitToName() != null){
					pstmt.setString(suitToNameIndex, nameCharacterVO.getSuitToName());
				}else if (nameCharacterVO.getSuitGender() != null) {
					pstmt.setString(suitGenderIndex, nameCharacterVO.getSuitGender());
				}else if (nameCharacterVO.getPronunciation() != null) {
					pstmt.setString(pronunciationIndex, nameCharacterVO.getPronunciation());
				}else if (nameCharacterVO.getLiteralness() != null) {
					pstmt.setString(literalnesIndex, nameCharacterVO.getLiteralness());
				}else if (nameCharacterVO.getChaQuotation() != null) {
					pstmt.setString(quotationIndex, nameCharacterVO.getChaQuotation());
				}else if (nameCharacterVO.getCharMeaning() != null) {
					pstmt.setString(meaningIndex, nameCharacterVO.getCharMeaning());
				}else if (nameCharacterVO.getRichReligionary() != null) {
					pstmt.setString(religionaryIndex, nameCharacterVO.getRichReligionary());
				}else if (nameCharacterVO.getIsUsedInElder() != null) {
					pstmt.setString(isUsedElderIndex, nameCharacterVO.getIsUsedInElder());
				}else {
					
				}
			}
			
			rs = pstmt.executeQuery();
			charsList = QueryUtil.getNameCharsList(rs);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException();
		} finally{
			try {
				ConnectionUtil.closeConnection(rs, pstmt, connection);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			}
		}
		return charsList;
	}
}
