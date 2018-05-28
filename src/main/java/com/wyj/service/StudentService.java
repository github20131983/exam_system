package com.wyj.service;

import java.util.List;

import com.wyj.po.Student;

public interface StudentService {
	public List<Student> getStudentByName(String studentName);
	public List<Student> getStudentByClass(String sclass);
}
