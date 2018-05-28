package com.wyj.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Student;
import com.wyj.service.StudentService;
import com.wyj.service.StudentServiceImpl;

public class LoginAction extends ActionSupport{
   private String id;
   private String password;
   private StudentService studentService=new StudentServiceImpl();
   public String getId() {
	   System.out.println("aaaaaaa");
	return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
public String ececute() throws Exception{
	System.out.println(id+" "+password);
	   if(studentService.allowLogin(id, password)){
		  //Student studentInfo=studentService.getStudentInfo(id);
		  // Map session=ActionContext.getContext().getSession();
		  // session.put("studentInfo", studentInfo);
		  // System.out.println(id+" "+password);
		   return SUCCESS;
	   }
	   else{
		   addActionError("用户名或者密码不正确");
		   return this.INPUT;
	   }
   }
}
