package com.wyj.service;

import java.util.List;

import com.wyj.po.Subject;

public interface SubjectService {
	public boolean saveSubject(Subject subject);//添加试题，返回是否成功
	public Subject showParcularSubject(int subjectID);//查看试题
	public void updateSubject(Subject subject);//更新试题
	public void deleteSubject(int subjectID);//删除试题
	public List<Subject> findAllSubject();//查询所有试题
	public List<Subject> likeQueryBySubjectTitle(String subjectTitle);//模糊查询所有试题
	public List<Subject> randomFindSubject(int num);//随机取出一定数目的试题
	public int accountResult(List<Integer> subjectIDs, List<String> studentAnswers);
	public Subject showSubjectParticular(Integer subjectID);
}
