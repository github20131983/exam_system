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
	<table>
		  <tr align="center">
			<td>学生编号</td>
			<td>所在班级</td>
			<td>学生姓名</td>
			<td>学生成绩</td>
		  </tr>
		  <s:iterator value="#request.students" var="student">
		  	  <tr>
					<td><s:property value="#student.studentID"/></td>
					<td><s:property value="#student.sclass"/></td>
					<td><s:property value="#student.name"/></td>
					<td><s:property value="#student.result"/></td>
			  </tr>
		  </s:iterator>					  
	</table>
</body>
</html>