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
		subject.setSubjectTitle("大熊猫是哪国的？");
		subject.setSubjectOptionA("中国");
		subject.setSubjectOptionB("美国");
		subject.setSubjectOptionC("英国");
		subject.setSubjectOptionD("日本");
		subject.setSubjectAnswer("A");
		subject.setSubjectParse("大熊猫是中国的特有动物，送分题");
		ssi.saveSubject(subject);
		assertEquals(false,ssi.saveSubject(subject));
	}

}
