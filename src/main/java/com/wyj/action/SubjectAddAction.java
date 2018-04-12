package com.wyj.action;

import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Subject;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class SubjectAddAction extends ActionSupport {
	private String subjectAnswer;
	private String subjectOptionA;
	private String subjectOptionB;
	private String subjectOptionC;
	private String subjectOptionD;
	private String subjectParse;
	private String subjectTitle;
	private SubjectService subjectService=new SubjectServiceImpl();
	public String getSubjectAnswer() {
		return subjectAnswer;
	}
	public void setSubjectAnswer(String subjectAnswer) {
		this.subjectAnswer = subjectAnswer;
	}
	public String getSubjectOptionA() {
		return subjectOptionA;
	}
	public void setSubjectOptionA(String subjectOptionA) {
		this.subjectOptionA = subjectOptionA;
	}
	public String getSubjectOptionB() {
		return subjectOptionB;
	}
	public void setSubjectOptionB(String subjectOptionB) {
		this.subjectOptionB = subjectOptionB;
	}
	public String getSubjectOptionC() {
		return subjectOptionC;
	}
	public void setSubjectOptionC(String subjectOptionC) {
		this.subjectOptionC = subjectOptionC;
	}
	public String getSubjectOptionD() {
		return subjectOptionD;
	}
	public void setSubjectOptionD(String subjectOptionD) {
		this.subjectOptionD = subjectOptionD;
	}
	public String getSubjectParse() {
		return subjectParse;
	}
	public void setSubjectParse(String subjectParse) {
		this.subjectParse = subjectParse;
	}
	public String getSubjectTitle() {
		return subjectTitle;
	}
	public void setSubjectTitle(String subjectTitle) {
		this.subjectTitle = subjectTitle;
	}
	public SubjectService getSubjectService() {
		return subjectService;
	}
	public void setSubjectService(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	public String execute() throws Exception{
		Subject subject=new Subject();
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectTitle(subjectTitle);
		subject.setSubjectAnswer(subjectAnswer);
		subject.setSubjectOptionA(subjectOptionA);
		subject.setSubjectOptionB(subjectOptionB);
		subject.setSubjectOptionC(subjectOptionC);
		subject.setSubjectOptionD(subjectOptionD);
		subject.setSubjectParse(subjectParse);
		if(subjectService.saveSubject(subject)){
			System.out.println("成功");
			return SUCCESS;			
		}
		else{
			this.addActionError("该试题已经添加过，请不要重复添加！");
			return INPUT;
		}	
	}
}
