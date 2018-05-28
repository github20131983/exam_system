package com.wyj.service;

import java.util.List;

import com.wyj.dao.StudentDAO;
import com.wyj.dao.StudentDAOImpl;
import com.wyj.po.Student;

public class StudentServiceImpl implements StudentService{
	private StudentDAO studentDAO =  new StudentDAOImpl();
	
	public List<Student> getStudentByName(String studentName){
		return studentDAO.findByStudentName(studentName);		
	}

	public List<Student> getStudentByClass(String sclass) {		
		return studentDAO.findByStudentClass(sclass);
	}
}
