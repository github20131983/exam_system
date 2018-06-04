package com.wyj.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wyj.po.Student;
import com.wyj.service.StudentService;
import com.wyj.service.StudentServiceImpl;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class SubmitExamAction extends ActionSupport {
	private List<Integer> subjectID;//学生考试的题目
	private SubjectService subjectService = new SubjectServiceImpl();
	private StudentService studentService = new StudentServiceImpl();
	public List<Integer> getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(List<Integer> subjectID) {
		this.subjectID = subjectID;
		for(int id:subjectID)
			System.out.println(id);
	}
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		List<String> studentAnswers = new ArrayList<String>();
		for(int i = 0; i < 5; i++) {
			String answer = request.getParameter("subjectAnswer"+i);
			studentAnswers.add(answer);
			System.out.println(answer);
		}
		int GeneralPoint = subjectService.accountResult(subjectID, studentAnswers);
		
		//设置成绩到学生信息中
		Map session = ActionContext.getContext().getSession();
		Student student = (Student)session.get("studentInfo");
		String studentID = student.getStudentID();
		studentService.setStudentResult(studentID, GeneralPoint);
		request.setAttribute("studentName", student.getName());//保存学生姓名和总分数
		request.setAttribute("GeneralPoint", GeneralPoint);
		session.put("subjectIDs", subjectID);//将考试题目保存到session，方便后面显示答案使用
		return SUCCESS;
	}
}
