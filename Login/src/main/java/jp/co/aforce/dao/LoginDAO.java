package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.beans.Pinfo;

public class LoginDAO extends DAO {

	public Pinfo search(String id, String pw) throws Exception {
		Pinfo p = null;

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				" select * from login where id = ? and password = ? ");
		st.setString(1, id);
		st.setString(2, pw);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			p = new Pinfo();
			p.setId(rs.getString("id"));
			p.setPw(rs.getString("password"));
			p.setUser(rs.getString("user"));

		}

		st.close();
		con.close();

		return p;
	}

	public int insert(Pinfo p) throws Exception {

		Connection con = getConnection();

		PreparedStatement st = con.prepareStatement(
				" insert into login values(?, ?, ?) ");
		st.setString(1, p.getId());
		st.setString(2, p.getPw());
		st.setString(3, p.getUser());
		int line = st.executeUpdate();

		st.close();
		con.close();

		return line;

	}
}
