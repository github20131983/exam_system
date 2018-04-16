package com.wyj.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Subject;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class SubjectParticularAction extends ActionSupport{
	private int subjectID;
	private SubjectService subjectService = new SubjectServiceImpl();
	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public String execute() throws Exception {
		Subject subject = subjectService.showParcularSubject(subjectID);
		ServletActionContext.getRequest().setAttribute("subject", subject);
		return SUCCESS;
	}
}
