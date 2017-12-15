<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>login</title>
</head>
<body>

   	<table>
	<tr>
		<td>用户名:</td>
		<td><%=request.getParameter("username")%></td>
	</tr>
	<tr>
		<td>密码:</td>
		<td><%=request.getParameter("passwd")%></td>
	</tr>
	</table>
</body>
</html>