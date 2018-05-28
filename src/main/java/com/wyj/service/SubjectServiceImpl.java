package com.wyj.service;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;

import com.wyj.dao.SubjectDAO;
import com.wyj.dao.SubjectDAOImpl;
import com.wyj.hibernate.HibernateSessionFactory;
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

	public Subject showParcularSubject(int subjectID) {	
		return subjectDAO.findSubjectByID(subjectID);
	}

	public void updateSubject(Subject subject) {
		subjectDAO.updateSubject(subject);	
	}

	public void deleteSubject(int subjectID) {
		subjectDAO.deleteSubject(subjectID);
	}

	public List<Subject> findAllSubject() {
		return subjectDAO.findAllSubject();
	}

	public List<Subject> likeQueryBySubjectTitle(String subjectTitle) {
		return subjectDAO.likeQueryByTitle(subjectTitle);
	}
}
