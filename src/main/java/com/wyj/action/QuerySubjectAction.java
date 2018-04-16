package com.wyj.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Subject;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class QuerySubjectAction extends ActionSupport {
	private SubjectService subjectService = new SubjectServiceImpl();
	public String execute() throws Exception {	
		List<Subject> subjects = subjectService.findAllSubject();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("subjects", subjects);
		return SUCCESS;
	}
}
