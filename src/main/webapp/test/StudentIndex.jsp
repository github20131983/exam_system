<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
 var ksTime; //定义考试时间以分钟计算
 ksTime = 0.5;//测试用
 if(readCookie("ss")==""){
  setCookie("ss",new Date(),ksTime/60);
 }
 function sT(){
  var tti = new Date();
  var s = readCookie("ss");////单独出来
  var lt  = parseInt((tti-new Date(readCookie("ss")))/1000)
  if(s==''||(ksTime*60-lt)<0){
   setCookie("ss",new Date(),0);
   alert("考试时间到!\n即将提交试卷!");
   document.forms[0].submit();
  }else{
  	lm = Math.floor(lt / 60);
	ls = lt % 60;
	allY = ksTime*60-lt;
	ym = Math.floor(allY / 60);
	ys = allY % 60;
   document.getElementById("tTime").innerHTML = "考试已经开始了" + lm + "分" + ls + "秒" + ",剩余"  + ym + "分" + ys + "秒";
   var ttt = setTimeout("sT()",1000);
  }
 }
 function readCookie(name) { 
  var cookieValue = ""; 
  var search = name + "="; 
  if(document.cookie.length > 0) { 
   offset = document.cookie.indexOf(search); 
   if (offset != -1) { 
    offset += search.length; 
    end = document.cookie.indexOf(";", offset); 
    if (end == -1) 
     end = document.cookie.length; 
    cookieValue = document.cookie.substring(offset, end) 
   } 
  }
  return cookieValue; 
 }  
 function setCookie(name, value, hours) { 
  var expire = ""; 
  if(hours != null) { 
   expire = new Date((new Date()).getTime() + hours * 3600000); 
   expire = "; expires=" + expire.toGMTString(); 
  } 
  document.cookie = name + "=" + value + expire; 
 }
 </script>
</head>
<body onload="sT()">
<table>
  <tr>
    <td>
	 <form action="submitExam.action" method="post">
	<table>
      <tr>
        <td>考试时间：120 分钟</td>
        <td>考生：
        <s:property value="#session.studentInfo.getName()"/></td><!-- 注意取名 -->
        <td>总分 ：100 分</td>
      </tr>
      <tr>
      <td><div id="tTime"></div></td>
      </tr>
      <tr>
        <td>选择题(每小题5分，共20个)</td>
      </tr>
	  <!--题目开始-->
	 
	  <s:iterator value="#request.subjects" var="subject" status="sta">
	  	<input type="hidden" name="subjectID" value="<s:property value="#request.subject.subjectID"/>"/>
	  	 <tr>	  	 
        <td>第<s:property value="#sta.index+1"/>题、&nbsp;        
        <s:property value="#request.subject.subjectTitle"/></td>
      </tr>
      <tr>
        <td>A．<s:property value="#request.subject.subjectOptionA"/></td>
      </tr>
      <tr>
        <td>B．<s:property value="#request.subject.subjectOptionB"/></td>
      </tr>
      <tr>
        <td>C．<s:property value="#request.subject.subjectOptionC"/></td>
      </tr>
      <tr>
        <td>D．<s:property value="#request.subject.subjectOptionD"/></td>
      </tr>
      <tr>
        <td>选择答案：      
          <input type="radio" name="subjectAnswer<s:property value="#request.sta.index"/>" value="A" />          
          A
          <input type="radio" name="subjectAnswer<s:property value="#request.sta.index"/>" value="B" />
          B
          <input type="radio" name="subjectAnswer<s:property value="#request.sta.index"/>" value="C" />
          C
          <input type="radio" name="subjectAnswer<s:property value="#request.sta.index"/>" value="D" />
          D</td>
      </tr>
	  </s:iterator>
	   <!--题目结束-->
      <tr>
        <td >
          <input type="submit" value=" 提交答卷 " name="Submit" />
        </td>
      </tr>
    </table>
     </form>
    </td>
  </tr>
</table>
</body>
</html>