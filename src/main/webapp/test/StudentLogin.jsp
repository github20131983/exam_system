<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <form action="studentLogin.action" method="post">
	  <%--用户名：<s:textfield name="id"/>
	  密码： <s:password name="password" /> --%>
	  <input name="id" type="text">
	  <input name="pass" type="password">
	  <input name="submit" type="submit" value="提交">
<%-- 	  <s:submit name="submit" value="提交"/> --%>
	</form>
</body>
</html>