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
    <td >&nbsp;</td>
    <td >
	<table>
      <tr>
        <td></td>
      </tr>
      <tr>
        <td ><div ><span >考试情况表</span></div></td>
      </tr>
      <tr>
        <td >&nbsp;</td>
      </tr>
      <tr>
        <td><div >考试姓名:<s:property value="#request.studentName"/></div></td>
        <td><div >考生得分:<s:property value="#request.GeneralPoint"/>分</div></td>
      </tr>
      <tr>
        <td ><div><a href="showSubjectAnswer.action">查看答案</a></div></td>
      </tr>
    </table></td>
    <td >&nbsp;</td>
  </tr>
</table>
</body>
</html>