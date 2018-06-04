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
    <td>
	<table>
      <tr>
        <td><div >考试时间：120 分钟</div></td>
        <td><div >考生：<s:property value="#session.studentInfo.getName()"/></div></td>
        <td><div>总分 ：100 分</div></td>
      </tr>
      <tr>
        <td>&nbsp;</td>
        <td></td>
        <td>&nbsp;</td>
      </tr>
      <tr>
        <td >选择题(每小题20分，共5个)</td>
      </tr>
	  <!--题目开始-->
	  <s:iterator value="#request.subjects" var="subject" status="sta">
      <tr>
        <td>第<s:property value="#sta.index+1"/>题&nbsp;<s:property value="#request.subject.subjectTitle"/></td>
      </tr>
      <tr>
        <td >A．<s:property value="#request.subject.subjectOptionA"/></td>
      </tr>
      <tr>
        <td >B．<s:property value="#request.subject.subjectOptionA"/></td>
      </tr>
      <tr>
        <td >C．<s:property value="#request.subject.subjectOptionA"/></td>
      </tr>
      <tr>
        <td >D．<s:property value="#request.subject.subjectOptionA"/></td>
      </tr>
      <tr>
        <td>
		<strong>【正确答案】：<s:property value="#request.subject.subjectAnswer"/></strong><br/>
        <strong>【参考解析】：<s:property value="#request.subject.subjectParse"/></strong></tr>
      </s:iterator>  
    </table></td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>