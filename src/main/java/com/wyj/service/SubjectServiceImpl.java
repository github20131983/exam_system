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

	public List<Subject> randomFindSubject(int num) {
		return subjectDAO.randomFindSubject(num);
	}

	public int accountResult(List<Integer> subjectIDs, List<String> studentAnswers) {
		int GeneralPoint = 0;//总分
		for(int i = 0; i < subjectIDs.size(); i++) {
			String rightAnswer = subjectDAO.
				findSubjectByID(subjectIDs.get(i)).getSubjectAnswer();//得到正确答案，通过试题ID
			if(rightAnswer.equals(studentAnswers.get(i))) {
				GeneralPoint += 20;//加20分
			}
		}
		return GeneralPoint;
	}

	public Subject showSubjectParticular(Integer subjectID) {
		return subjectDAO.findSubjectByID(subjectID);
	}
}
