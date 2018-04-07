package com.wyj.service;

import com.wyj.dao.SubjectDAO;
import com.wyj.dao.SubjectDAOImpl;
import com.wyj.po.Subject;

public class SubjectServiceImpl implements SubjectService{
	private SubjectDAO subjectDAO =  new SubjectDAOImpl();
	public boolean saveSubject(Subject subject){
		String subjectTitle=subject.getSubjectTitle();
		if(subjectDAO.findSubjectByTitle(subjectTitle)==null){
			subjectDAO.addSubject(subject);
			return true;
		}
		else
			return false;
}
}