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
	  <tr>
	    <td>试题编号:</td>
	    <td><s:property value="#request.subject.subjectID"/></td>
      </tr>
	  <tr>
		<td>试题题目:</td>
		<td><s:property value="#request.subject.subjectTitle"/></td>
	  </tr>
	  <tr>
		<td>选项A:</td>
		<td><s:property value="#request.subject.subjectOptionA"/></td>
	  </tr>
	   <tr>
		<td>选项B:</td>
		<td><s:property value="#request.subject.subjectOptionB"/></td>
	  </tr>
	   <tr>
		<td>选项C:</td>
		<td><s:property value="#request.subject.subjectOptionC"/></td>
	  </tr>
	   <tr>
		<td>选项D:</td>
		<td><s:property value="#request.subject.subjectOptionD"/></td>
	  </tr>
	   <tr>
		<td>答案:</td>
		<td><s:property value="#request.subject.subjectAnswer"/></td>
	  </tr>
	  <tr>
		<td>答案解析:</td>
		<td><s:property value="#request.subject.subjectParse"/></td>
	  </tr>
 </table>
</body>
</html>