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

	public boolean allowLogin(String studentID, String password) {
		Student student=studentDAO.findByStudentID(studentID);
		if(student==null)
			return false;
		else{
			if(password.equals(student.getPassword()))
				return true;
			else 
				return false;
		}
	}

	public Student getStudentInfo(String studentID) {
		return studentDAO.findByStudentID(studentID);
	}

	public void setStudentResult(String studentID, int result) {
		Student student = studentDAO.findByStudentID(studentID);
		student.setResult(result);
		studentDAO.updateStudent(student);
		
	}
}
