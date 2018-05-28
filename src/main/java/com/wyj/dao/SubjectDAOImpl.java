package com.wyj.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wyj.hibernate.HibernateSessionFactory;
import com.wyj.po.Subject;

public class SubjectDAOImpl implements SubjectDAO{
	
	public Subject findSubjectByTitle (String subjectTitle) {
		Session session=HibernateSessionFactory.getSession();
		Query<Subject> query=session.createQuery("from Subject as sub where sub.subjectTitle=?");
		query.setString(0,subjectTitle);
		List<Subject> list=query.getResultList();
		HibernateSessionFactory.closeSession();
		if(list.size()==0)
			return null;
		else
			return list.get(0);
	}
	
	public void addSubject(Subject subject){
		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=null;
		try {
			transaction=session.beginTransaction();
			session.save(subject);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
	
	public Subject findSubjectByID(int subjectID){
		Session session=HibernateSessionFactory.getSession();
		Subject subject=(Subject)session.get(Subject.class, subjectID);
		HibernateSessionFactory.closeSession();
		return subject;
	}
	
	public void updateSubject(Subject subject) {
		Session session=HibernateSessionFactory.getSession();
		Transaction transaction=null;
		try {
			transaction=session.beginTransaction();
			session.update(subject);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}
	
	public void deleteSubject(int subjectID) {
		Session session=HibernateSessionFactory.getSession();
		Subject subject=session.get(Subject.class, subjectID);
		Transaction transaction=null;
		try {
			transaction=session.beginTransaction();
			session.delete(subject);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		HibernateSessionFactory.closeSession();
	}

	public List<Subject> findAllSubject() {
		Session session=HibernateSessionFactory.getSession();
		Query<Subject> query=session.createQuery("from Subject");
		List<Subject> list=query.getResultList();
		HibernateSessionFactory.closeSession();
		return list;
	}

	public List<Subject> likeQueryByTitle(String subjectTitle) {
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Subject as sub where sub.subjectTitle like:title");
		query.setString("title","%"+subjectTitle+"%");
		List<Subject> list=query.getResultList();
		HibernateSessionFactory.closeSession();
		if(list.size()==0)
			return null;
		else
			return list;
	}
}
