package exam_system;

import com.wyj.dao.SubjectDAOImpl;

public class TestDAO {
public static void main(String[] args){
	SubjectDAOImpl sdi=new SubjectDAOImpl();
	System.out.println(sdi.findSubjectByTitle("���и�����������������()"));
}
}
