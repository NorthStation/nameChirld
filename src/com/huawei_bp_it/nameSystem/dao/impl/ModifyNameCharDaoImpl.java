package com.huawei_bp_it.nameSystem.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.huawei_bp_it.nameSystem.dao.IModifyNameCharDao;
import com.huawei_bp_it.nameSystem.exception.DAOException;
import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;
import com.huawei_bp_it.nameSystem.util.ConnectionUtil;

/**
 * TODO 更新文字信息
 * 
 * @author Administrator
 * @since 2014年11月13日21:07:59
 */
public class ModifyNameCharDaoImpl implements IModifyNameCharDao {

	/**
	 * TODO 单个修改
	 * 
	 * @param characterVO
	 * @return
	 * @throws DAOException
	 */
	public boolean updateSingleCharInfo(NameCharacterVO characterVO) throws DAOException {
		boolean succeed = false;
		if (null != characterVO) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();
				String sql = "update name_character_t nct set " + "nct.structure = '?' ," + "nct.char_num = ?, " + "nct.suit_to_name = '?'," + "nct.suit_to_gener = '?'," + "nct.pronunciation = '?', " + "nct.literalness = '?',  " + "nct.quotation = '?', " + "nct.meaning = '?', " + "nct.religionary = '?',  " + "nct.is_used_elder = '?' " + "where nct.id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(0, characterVO.getStructure());
				pstmt.setInt(1, characterVO.getCharNum());
				pstmt.setString(2, characterVO.getSuitToName());
				pstmt.setString(3, characterVO.getSuitGender());
				pstmt.setString(4, characterVO.getPronunciation());
				pstmt.setString(5, characterVO.getLiteralness());
				pstmt.setString(6, characterVO.getChaQuotation());
				pstmt.setString(7, characterVO.getCharMeaning());
				pstmt.setString(8, characterVO.getRichReligionary());
				pstmt.setString(9, characterVO.getIsUsedInElder());
				pstmt.setInt(10, characterVO.getCharId());

				int res = pstmt.executeUpdate();
				if (res > 0) {
					succeed = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally {
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
	 * TODO 批量修改文字
	 * 
	 * @param characterVOs
	 * @return
	 * @throws DAOException
	 */
	public boolean updateMultiCharInfo(List<NameCharacterVO> characterVOs) throws DAOException {
		boolean succeed = false;
		if (null != characterVOs && !characterVOs.isEmpty()) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();
				for (NameCharacterVO characterVO : characterVOs) {
					String sql = "update name_character_t nct set " + "nct.structure = '?' ," + "nct.char_num = ?, " + "nct.suit_to_name = '?'," + "nct.suit_to_gener = '?'," + "nct.pronunciation = '?', " + "nct.literalness = '?',  " + "nct.quotation = '?', " + "nct.meaning = '?', " + "nct.religionary = '?',  " + "nct.is_used_elder = '?' " + "where nct.id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(0, characterVO.getStructure());
					pstmt.setInt(1, characterVO.getCharNum());
					pstmt.setString(2, characterVO.getSuitToName());
					pstmt.setString(3, characterVO.getSuitGender());
					pstmt.setString(4, characterVO.getPronunciation());
					pstmt.setString(5, characterVO.getLiteralness());
					pstmt.setString(6, characterVO.getChaQuotation());
					pstmt.setString(7, characterVO.getCharMeaning());
					pstmt.setString(8, characterVO.getRichReligionary());
					pstmt.setString(9, characterVO.getIsUsedInElder());
					pstmt.setInt(10, characterVO.getCharId());
					pstmt.addBatch();
				}

				int[] res = pstmt.executeBatch();
				if (res.length == characterVOs.size()) {
					succeed = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally {
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
	 * TODO 删除单个文字
	 * 
	 * @param nameCharacterVO
	 * @return
	 * @throws DAOException
	 */
	public boolean deleteSingleChar(NameCharacterVO nameCharacterVO) throws DAOException {
		boolean success = false;
		if (null != nameCharacterVO) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();
				String sql = "delete from name_character_t nct where nct.id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(0, nameCharacterVO.getCharId());

				int res = pstmt.executeUpdate();
				if (res > 0) {
					success = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally {
				try {
					ConnectionUtil.closeConnection(rs, pstmt, conn);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new DAOException();
				}
			}
		}
		return success;
	}

	/**
	 * TODO 批量删除文字
	 * 
	 * @param nameCharacterVO
	 * @return
	 * @throws DAOException
	 */
	public boolean deleteMultiChar(List<NameCharacterVO> nameCharacterVOs) throws DAOException {
		boolean success = false;
		if (null != nameCharacterVOs && !nameCharacterVOs.isEmpty()) {
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				conn = ConnectionUtil.getConnection();

				for (NameCharacterVO characterVO : nameCharacterVOs) {
					String sql = "delete from name_character_t nct where nct.id = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(0, characterVO.getCharId());
					pstmt.addBatch();
				}

				int[] res = pstmt.executeBatch();
				if (res.length == nameCharacterVOs.size()) {
					success = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DAOException();
			} finally {
				try {
					ConnectionUtil.closeConnection(rs, pstmt, conn);
				} catch (SQLException e) {
					e.printStackTrace();
					throw new DAOException();
				}
			}
		}
		return success;
	}

	@Override
	public boolean deleteSingleNameChar(NameCharacterVO nameCharacterVO) throws DAOException {
		return false;
	}
}
