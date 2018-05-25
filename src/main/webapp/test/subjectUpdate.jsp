<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <div>              
		<form action="subjectUpadate.action" method="post">
		<table>
		  <tr>
			<td>
				<s:textfield name="subjectID" type="hidden" value="%{#request.subject.subjectID}" />
				<s:textfield label="试题题目" name="subjectTitle" type="text" value="%{#request.subject.subjectTitle}"/>
			</td>
		  </tr>
		  <tr>
			<td><s:textfield label="选项A" type="text" name="subjectOptionA" value="%{#request.subject.subjectOptionA}"/></td>
		  </tr>
		   <tr>
			<td><s:textfield label="选项B" type="text" name="subjectOptionB" value="%{#request.subject.subjectOptionB}"/></td>
		  </tr>
		   <tr>
			<td><s:textfield label="选项C" type="text" name="subjectOptionC" value="%{#request.subject.subjectOptionC}"/></td>
		  </tr>
		   <tr>
			<td><s:textfield label="选项D" type="text" name="subjectOptionD" value="%{#request.subject.subjectOptionD}"/></td>
		  </tr>
		   <tr>
			<td>
			<s:radio label="答案" list="#{'A':'A','B':'B','C':'C','D':'D'}" 
			name="subjectAnswer" value="#request.subject.subjectAnswer"/>
			</td>
		  </tr>
		  <tr>
			<td>答案解析:</td>
			<td>
				<textarea name="subjectParse"><s:property value="#request.subject.subjectParse"/></textarea>
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