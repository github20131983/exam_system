package exam_system;

import org.hibernate.dialect.AbstractHANADialect;

import com.wyj.dao.SubjectDAOImpl;
import com.wyj.po.Subject;

public class TestDAO {
public static void main(String[] args){
	SubjectDAOImpl sdi=new SubjectDAOImpl();
	//System.out.println(sdi.findSubjectByTitle("下列各进制数中最大的数是()"));
	Subject subject=new Subject();
	subject.setSubjectID(1);
	subject.setSubjectTitle("大熊猫是哪国的？");
	subject.setSubjectOptionA("中国");
	subject.setSubjectOptionB("美国");
	subject.setSubjectOptionC("英国");
	subject.setSubjectOptionD("日本");
	subject.setSubjectAnswer("A");
	subject.setSubjectParse("大熊猫是中国的特有动物，送分题");
	sdi.addSubject(subject);
}
}
