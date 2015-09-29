package com.huawei_bp_it.nameSystem.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.huawei_bp_it.nameSystem.pojo.NameCharacterVO;

/**
 * TODO 查询工具
 * @author Administrator
 * @since 2014年11月8日14:10:52
 */
public class QueryUtil {

	/**
	 * TODO 从SQL的查询结果集中查询出所有的字集
	 * @param rs SQL的查询结果集
	 * @return
	 * @throws SQLException
	 */
	public static List<NameCharacterVO> getNameCharsList(ResultSet rs) throws SQLException{
		List<NameCharacterVO> nameCharsList = null;
		if(null != rs){
			nameCharsList = new ArrayList<NameCharacterVO>();
			NameCharacterVO nameChar ;
			while (rs.next()) {
				nameChar = new NameCharacterVO();
				nameChar.setCharId(rs.getInt("id"));
				nameChar.setStructure(rs.getString("structure"));
				nameChar.setCharNum(rs.getInt("char_num"));
				nameChar.setSuitToName(rs.getString("suit_to_name"));
				nameChar.setSuitGender(rs.getString("suit_to_gener"));
				nameChar.setPronunciation(rs.getString("pronunciation"));
				nameChar.setRichReligionary(rs.getString("literalness"));
				nameChar.setCharMeaning(rs.getString("meaning"));
				nameChar.setLiteralness(rs.getString("literalness"));
				nameChar.setChaQuotation(rs.getString("quotation"));
				nameChar.setIsUsedInElder(rs.getString("is_used_elder"));
				
				nameCharsList.add(nameChar);
			}
			rs.close();
		}
		return nameCharsList;
	}
}
