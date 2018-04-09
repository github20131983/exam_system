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
			return SUCCESS;
		}
		else{
			this.addActionError("该试题已经添加过，请不要重复添加！");
			return INPUT;
		}	
	}
}
