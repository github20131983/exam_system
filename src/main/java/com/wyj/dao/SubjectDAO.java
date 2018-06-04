package com.wyj.dao;

import java.util.List;

import com.wyj.po.Subject;

public interface SubjectDAO {
	public Subject findSubjectByTitle (String subjectTitle);//根据题目找题
	public void addSubject(Subject subject);//添加题目
	public Subject findSubjectByID(int subjectID);//根据ID找题
	public void updateSubject(Subject subject);//更新题库
	public void deleteSubject(int subjectID);//删除题目
	public List<Subject> findAllSubject();	//查询所有题目
	public List<Subject> likeQueryByTitle(String subjectTitle);//模糊查询关键词
	public List<Subject> randomFindSubject(int number);//随机查询一定数量的试题
}
