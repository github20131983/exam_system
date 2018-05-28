package com.wyj.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Subject;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class LikeQuerySubjectAction extends ActionSupport {
	private String subjectTitle;
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	private SubjectService subjectService=new SubjectServiceImpl();
	public String execute() throws Exception{
		List<Subject> subjects = subjectService.likeQueryBySubjectTitle(subjectTitle);;
		List<Subject> newSubjects=new ArrayList<Subject>();
		for(Subject subject:subjects){
			String newTitle=subject.getSubjectTitle().replaceAll(subjectTitle, 
					"<font color='red'>"+subjectTitle+"</font>");
			subject.setSubjectTitle(newTitle);
			newSubjects.add(subject);
		}
		HttpServletRequest request=ServletActionContext.getRequest();
		request.setAttribute("subjects", newSubjects);
		return SUCCESS;	
	}
}
