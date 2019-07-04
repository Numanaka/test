<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<s:property value="#session.loginDTOList.get(0).username"/>さん、ようこそ！

<br>
<table>
<tbody>
<tr>
	<th>USERNAME</th>
	<th>PASSWORD</th>
</tr>

<s:iterator value="#session.loginDTOList">
<tr>
	<td><s:property value="username"/></td>
	<td><s:property value="password"/></td>
</tr>
</s:iterator>

</tbody>
</table>


</body>
</html>