package com.wyj.dao;

import java.util.List;

import com.wyj.po.Subject;

public interface SubjectDAO {
	public Subject findSubjectByTitle (String subjectTitle);//������Ŀ����
	public void addSubject(Subject subject);//�����Ŀ
	public Subject findSubjectByID(int subjectID);//����ID����
	public void updateSubject(Subject subject);//�������
	public void deleteSubject(int subjectID);//ɾ����Ŀ
	public List<Subject> findAllSubject();	//��ѯ������Ŀ
	public List<Subject> likeQueryByTitle(String subjectTitle);//ģ����ѯ�ؼ���
	public List<Subject> randomFindSubject(int number);//�����ѯһ������������
}
