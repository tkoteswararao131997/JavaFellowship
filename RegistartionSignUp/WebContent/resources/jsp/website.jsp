<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>website page</title>
<link rel="stylesheet" type="text/css" href="../css/website.css">
</head>
<body>

	<%
		response.setHeader("cache-control", "no-cache,no-store,must-revalidate");
		if (session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<form action="Logout" method="post">
		<table border="1">
			<tr class="heading">
				<th>name</th>
				<th>weight</th>
				<th>price</th>
				<th>quantity</th>
			</tr>
		<%
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "kevin", "password");
			PreparedStatement st = con.prepareStatement("select * from inventory");
			ResultSet rs = st.executeQuery("select * from inventory");
			while (rs.next()) {
		%>
		<tr class="data" align="center">
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("weight")%></td>
			<td><%=rs.getString("price")%></td>
			<td><%=rs.getString("quantity")%></td>
		</tr>
		<%
			}
		%>
		</table>
	<div align="center">
		<input  id="logout" type="submit" value="Logout"></br>
	</div>



	</form>
</body>
</html>