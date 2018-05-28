package com.wyj.service;

import java.util.List;

import com.wyj.po.Student;

public interface StudentService {
	public List<Student> getStudentByName(String studentName);//按照名字查询成绩
	public List<Student> getStudentByClass(String sclass);//按照班级查询成绩
	public boolean allowLogin(String studentID,String password);//登录查询
	public Student getStudentInfo(String studentID);//获得学生ID
}
