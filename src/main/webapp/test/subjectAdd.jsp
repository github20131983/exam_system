<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib prefix="s" uri="/struts-tags"%>
</head>
<body>
<div align="center"><!--录入试题表单-->
		<form action="subjectAdd.action" method="post">
		<table>
		  <tr>
			<td><s:actionerror/></td>
		  </tr>
		  <tr>
			<td>试题题目:</td>
			<td><input type="text" name="subjectTitle" size="80" ></td>
		  </tr>
		  <tr>
			<td>选项A:</td>
			<td><input type="text" name="subjectOptionA" size="20" ></td>
		  </tr>
		   <tr>
			<td>选项B:</td>
			<td><input type="text" name="subjectOptionB" size="20" ></td>
		  </tr>
		   <tr>
			<td>选项C:</td>
			<td><input type="text" name="subjectOptionC" size="20" ></td>
		  </tr>
		   <tr>
			<td>选项D:</td>
			<td><input type="text" name="subjectOptionD" size="20" ></td>
		  </tr>
		   <tr>
			<td>答案:</td>
			<td>
				<input name="subjectAnswer" type="radio" value="A">A
				<input name="subjectAnswer" type="radio" value="B">B
				<input name="subjectAnswer" type="radio" value="C">C
				<input name="subjectAnswer" type="radio" value="D">D
			</td>
		  </tr>
		  <tr>
			<td valign="top">试题解析:</td>
			<td>
				<textarea name="subjectParse" cols="76" rows="10"></textarea>
			</td>
		  </tr>
		  <tr>
		  	<td colspan="2"><div align="center">
		  	  <input type="submit" value="录入">				  	  
		  	  <input type="reset" value="重置">
	  	  </div>
		</td>
		  </tr>
	</table>
	</form>	
	</div>
</body>
</html>