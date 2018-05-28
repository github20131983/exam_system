package com.wyj.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.wyj.hibernate.HibernateSessionFactory;
import com.wyj.po.Student;

public class StudentDAOImpl implements StudentDAO{

	public List<Student> findByStudentName(String studentName) {
		Session session=HibernateSessionFactory.getSession();
		Query query=session.createQuery("from Student as stu where stu.name=?");
		query.setString(0, studentName);
		List list=query.list();
		HibernateSessionFactory.closeSession();
		return list;		
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	public List<Student> findByStudentClass(String sclass) {
		Session session = HibernateSessionFactory.getSession();//���Session����
		Query query = session.createQuery("from Student as stu where stu.sclass = ?");
		query.setString(0, sclass);
		List list = query.list();					//��ѯ������浽list��
		HibernateSessionFactory.closeSession();		//�ر�Session����
		return list;
	}

	public Student findByStudentID(String studentID) {
		// TODO Auto-generated method stub
		return null;
	}

}
