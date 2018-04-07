package exam_system;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wyj.po.Subject;
import com.wyj.service.SubjectServiceImpl;

public class SubjectServiceImplTest {
	SubjectServiceImpl ssi=new SubjectServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSaveSubject() {
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
	}

}
