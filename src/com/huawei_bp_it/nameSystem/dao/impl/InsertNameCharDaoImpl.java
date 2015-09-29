package com.huawei_bp_it.nameSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.huawei_bp_it.nameSystem.dao.IInsertNameCharDao;
import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.util.ConnectionUtil;

/**
 * TODO �����µ��ֵ�ʵ����
 * @author Administrator
 * @since 2014��11��13��20:29:33
 */
public class InsertNameCharDaoImpl implements IInsertNameCharDao {
	
	/**
	 * TODO ���뵥����
	 * @param nameChar
	 * @return
	 * @throws DAOException
	 */
	public boolean insertSingleChar(NameCharacterVO nameChar) throws DAOException{
		boolean succeed = false;
		if(nameChar != null){
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();
				//insert into name_character_t values(name_character_s.nextval,'��',7,'��',null,'��',null,'����',null,'ľ',null);
				String sql = "insert into name_character_t values(name_character_s.nextval,?,?,?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, nameChar.getStructure());
				pstmt.setInt(2, nameChar.getCharNum());
				pstmt.setString(3, nameChar.getSuitToName());
				pstmt.setString(4, nameChar.getSuitGender());
				pstmt.setString(5, nameChar.getPronunciation());
				pstmt.setString(6, nameChar.getLiteralness());
				pstmt.setString(7, nameChar.getChaQuotation());
				pstmt.setString(8, nameChar.getCharMeaning());
				pstmt.setString(9, nameChar.getRichReligionary());
				pstmt.setString(10, nameChar.getIsUsedInElder());
				
				int res = pstmt.executeUpdate();
				if(res>0){
					succeed = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally{
				try {
					ConnectionUtil.closeConnection(rs, pstmt, conn);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new DAOException();
				}
			}
		}
		return succeed;
	}
	
	/**
	 * TODO ���������
	 * @param chars
	 * @return
	 * @throws DAOException
	 */
	public boolean insertMultiChar(List<NameCharacterVO> chars) throws DAOException{
		boolean succeed = false;
		if(null != chars && !chars.isEmpty()){
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();
				for (NameCharacterVO nameChar : chars) {
					//insert into name_character_t values(name_character_s.nextval,'��',7,'��',null,'��',null,'����',null,'ľ',null);
					String sql = "insert into name_character_t values(name_character_s.nextval,'?',?,'?',?,'?',?,'?',?,'?',?)";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(0, nameChar.getStructure());
					pstmt.setInt(1, nameChar.getCharNum());
					pstmt.setString(2, nameChar.getSuitToName());
					pstmt.setString(3, nameChar.getSuitGender());
					pstmt.setString(4, nameChar.getPronunciation());
					pstmt.setString(5, nameChar.getLiteralness());
					pstmt.setString(6, nameChar.getChaQuotation());
					pstmt.setString(7, nameChar.getCharMeaning());
					pstmt.setString(8, nameChar.getRichReligionary());
					pstmt.setString(9, nameChar.getIsUsedInElder());
					pstmt.addBatch();
				}
				int[] res = pstmt.executeBatch();
				if(res.length == chars.size()){
					succeed = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally{
				try {
					ConnectionUtil.closeConnection(rs, pstmt, conn);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new DAOException();
				}
			}
		}
		return succeed;
	}
}
