package com.wyj.dao;

import com.wyj.po.Subject;

public interface SubjectDAO {
	public Subject findSubjectByTitle (String subjectTitle);//根据题目找题
	public void addSubject(Subject subject);//添加题目
	public Subject findSubjectByID(int subjectID);//根据ID找题
	public void updateSubject(Subject subject);//更新题库
	public void deleteSubject(int subjectID);
}
