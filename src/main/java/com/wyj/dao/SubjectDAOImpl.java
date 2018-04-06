package com.wyj.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.wyj.hibernate.HibernateSessionFactory;
import com.wyj.po.Subject;

public class SubjectDAOImpl implements SubjectDAO{
	public Subject findSubjectByTitle (String subjectTitle) {
		Session session=HibernateSessionFactory.getSession();
		Query<Subject> query=session.createQuery("from Subject as sub where sub.subjectTitle=?");
		query.setString(0,subjectTitle);
		List<Subject> list=query.list();
		HibernateSessionFactory.closeSession();
		if(list.size()==0)
			return null;
		else
			return list.get(0);
	}
}
