package com.registration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
import com.sun.net.httpserver.Authenticator.Result;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/users";
		String usname="kevin";
		String pwd="password";
		String query="select * from login";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,usname,pwd);
		System.out.println("connected to database");
		PreparedStatement st=con.prepareStatement(query);
		ResultSet rs=st.executeQuery(query);
		int i=0;
		while(rs.next())
		{
			String obj=rs.getString("uname");
			System.out.println(obj);
			i++;
		}
		st.close();
		//con.close();
		
		
	}
}
