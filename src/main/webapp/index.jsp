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
     显示所有题目：
  <form action="querySubject.action" method="post">
      <input type="submit" value="显示">
  </form>  
     查询带关键字的题目：
  <form action="subjectLikeQuery.action" method="post">
      <s:textfield name="subjectTitle" type="text"/>
      <input type="submit" value="查询">
  </form>
     查询成绩按照名字：
  <form action="QueryStudentByName.action" method="post">
      <s:textfield name="studentName" type="text"/>
      <input type="submit" value="查询">
  </form>
      查询成绩按照班级：
  <form action="QueryStudentByClass.action" method="post">
      <s:textfield name="sclass" type="text"/>
      <input type="submit" value="查询">
  </form>  
</body>
</html>
