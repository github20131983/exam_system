package exam_system;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wyj.po.Subject;
import com.wyj.service.SubjectService;
import com.wyj.service.SubjectServiceImpl;

public class SubjectServiceImplTest {
	SubjectService ssi=new SubjectServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	/*public void testSaveSubject() {
		Subject subject=new Subject();
		subject.setSubjectID(1);
		subject.setSubjectTitle("����è���Ĺ��ģ�");
		subject.setSubjectOptionA("�й�");
		subject.setSubjectOptionB("����");
		subject.setSubjectOptionC("Ӣ��");
		subject.setSubjectOptionD("�ձ�");
		subject.setSubjectAnswer("A");
		subject.setSubjectParse("����è���й������ж���ͷ���");
		ssi.saveSubject(subject);
		assertEquals(false,ssi.saveSubject(subject));
	}*/
	/*public void testShowParcularSubject() {
		assertEquals(ssi.showParcularSubject(1).getSubjectAnswer(),"A");
	}*/

	/*public void testUpdateSubject() {
		Subject subject=new Subject();
		subject.setSubjectID(2);
		subject.setSubjectTitle("5+1=?");
		subject.setSubjectParse("����");
		subject.setSubjectOptionA("4");
		subject.setSubjectOptionB("5");
		subject.setSubjectOptionC("6");
		subject.setSubjectOptionD("7");
		subject.setSubjectAnswer("C");
		ssi.updateSubject(subject);	
	}*/

	/*public void testDeleteSubject() {
		ssi.deleteSubject(3);
	}*/
	public void testfindAllSubject(){
		List<Subject> list=ssi.findAllSubject();
		for(Subject subject:list)
			System.out.println(subject.getSubjectParse());
	}
}
