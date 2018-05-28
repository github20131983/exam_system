package com.wyj.dao;

import java.util.List;

import com.wyj.po.Student;

public interface StudentDAO {
	public List<Student> findByStudentName(String studentName);//�����ֲ�ѯѧ��
	public void updateStudent(Student student);//����ѧ����Ϣ
	public List<Student> findByStudentClass(String sclass);//���ݰ༶����ѧ��
	public Student findByStudentID(String studentID);//��ѯ����������ѧ��ID��ѯ
}
