package com.wyj.service;

import java.util.List;

import com.wyj.po.Subject;

public interface SubjectService {
	public boolean saveSubject(Subject subject);//������⣬�����Ƿ�ɹ�
	public Subject showParcularSubject(int subjectID);//�鿴����
	public void updateSubject(Subject subject);//��������
	public void deleteSubject(int subjectID);//ɾ������
	public List<Subject> findAllSubject();//��ѯ��������
}
