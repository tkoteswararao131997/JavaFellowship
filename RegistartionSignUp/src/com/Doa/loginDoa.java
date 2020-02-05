package com.Doa;
import java.sql.*;
public class loginDoa 
{
	String sql="select * from login where uname=? and pwd=?";
	String url="jdbc:mysql://localhost:3306/users";
	String uname="root";
	String pwd="12";
	public boolean isuser(String uname,String pwd)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,uname,pwd);
			PreparedStatement st=con.prepareStatement(sql);
			st.setString(1, uname);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
}
