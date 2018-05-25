<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %> 
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		  <tr align="center">
			<td>试题编号</td>
			<td>试题标题</td>
			<td>正确答案</td>
			<td>查看试题</td>
			<td>更新试题</td>
			<td>删除试题</td>
		  </tr>
		  <s:iterator value="#request.subjects" var="subject">
		  	  <tr>
					<td><s:property value="#subject.subjectID"/></td>
					<td><s:property value="#subject.subjectTitle"/></td>
					<td><s:property value="#subject.subjectAnswer"/></td>
					<td><a href="subjectParticular.action?subjectID=<s:property value="#subject.subjectID"/>">查看</a></td>
					<td><a href="subjectUpdateBefore.action?subjectID=<s:property value="#subject.subjectID"/>">更新</a></td>
					<td><a href="subjectDelete?subjectID=<s:property value="#subject.subjectID"/>">删除</a></td>
			  </tr>
		  </s:iterator>					  
	</table>
</body>
</html>