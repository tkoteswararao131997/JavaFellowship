package com.Doa;

import java.sql.*;

public class loginDoa {
	String sql = "select * from login";
	String url = "jdbc:mysql://localhost:3306/users";
	String usname = "kevin";
	String pwd = "password";

	public boolean isuser(String uname, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, usname, pwd);
			PreparedStatement st = con.prepareStatement(sql);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("uname");
				String pass = rs.getString("password");
				if (uname.equals(name) && password.equals(pass))
					return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}
}
