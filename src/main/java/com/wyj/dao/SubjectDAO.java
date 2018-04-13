package com.wyj.dao;

import com.wyj.po.Subject;

public interface SubjectDAO {
	public Subject findSubjectByTitle (String subjectTitle);//������Ŀ����
	public void addSubject(Subject subject);//�����Ŀ
	public Subject findSubjectByID(int subjectID);//����ID����
	public void updateSubject(Subject subject);//�������
	public void deleteSubject(int subjectID);
}
