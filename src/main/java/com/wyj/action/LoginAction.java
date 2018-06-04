package com.wyj.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Student;
import com.wyj.service.StudentService;
import com.wyj.service.StudentServiceImpl;

public class LoginAction extends ActionSupport{
   private String id;
   private String pass;
   private StudentService studentService=new StudentServiceImpl();
   public String getId() {
	return id;
	}
	public void setId(String id) {	
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
public String execute() throws Exception{
	   if(studentService.allowLogin(id, pass)){	
		  Student studentInfo=studentService.getStudentInfo(id);
		  Map session=ActionContext.getContext().getSession();
		  session.put("studentInfo", studentInfo);
		  return this.SUCCESS;
	   }
	   else{
		   addActionError("用户名或者密码不正确");
		   return this.INPUT;
	   }
   }
}
