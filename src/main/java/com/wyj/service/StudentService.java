package com.wyj.service;

import java.util.List;

import com.wyj.po.Student;

public interface StudentService {
	public List<Student> getStudentByName(String studentName);//�������ֲ�ѯ�ɼ�
	public List<Student> getStudentByClass(String sclass);//���հ༶��ѯ�ɼ�
	public boolean allowLogin(String studentID,String password);//��¼��ѯ
	public Student getStudentInfo(String studentID);//���ѧ��ID
}
