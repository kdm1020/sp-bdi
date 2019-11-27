package com.sp.bdi.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("udao")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SqlSessionFactory ssf;

	@Override
	public List<Map<String, String>> SelectUserList() {
		SqlSession ss = ssf.openSession();
		try {
			return ss.selectList("com.sp.bdi.dao.UserInfoMapper.selectUserInfoList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ss.close();
		}
		return null;
	}

}
