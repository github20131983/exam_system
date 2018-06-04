package com.wyj.service;

import java.util.List;

import com.wyj.po.Subject;

public interface SubjectService {
	public boolean saveSubject(Subject subject);//������⣬�����Ƿ�ɹ�
	public Subject showParcularSubject(int subjectID);//�鿴����
	public void updateSubject(Subject subject);//��������
	public void deleteSubject(int subjectID);//ɾ������
	public List<Subject> findAllSubject();//��ѯ��������
	public List<Subject> likeQueryBySubjectTitle(String subjectTitle);//ģ����ѯ��������
	public List<Subject> randomFindSubject(int num);//���ȡ��һ����Ŀ������
	public int accountResult(List<Integer> subjectIDs, List<String> studentAnswers);
	public Subject showSubjectParticular(Integer subjectID);
}
