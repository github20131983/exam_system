package exam_system;

import org.hibernate.dialect.AbstractHANADialect;

import com.wyj.dao.SubjectDAOImpl;
import com.wyj.po.Subject;

public class TestDAO {
public static void main(String[] args){
	SubjectDAOImpl sdi=new SubjectDAOImpl();
	//System.out.println(sdi.findSubjectByTitle("���и�����������������()"));
	Subject subject=new Subject();
	subject.setSubjectID(1);
	subject.setSubjectTitle("����è���Ĺ��ģ�");
	subject.setSubjectOptionA("�й�");
	subject.setSubjectOptionB("����");
	subject.setSubjectOptionC("Ӣ��");
	subject.setSubjectOptionD("�ձ�");
	subject.setSubjectAnswer("A");
	subject.setSubjectParse("����è���й������ж���ͷ���");
	sdi.addSubject(subject);
}
}
