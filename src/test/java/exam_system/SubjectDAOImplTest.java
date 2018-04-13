package exam_system;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wyj.dao.SubjectDAOImpl;
import com.wyj.po.Subject;

public class SubjectDAOImplTest {
    SubjectDAOImpl sd=new SubjectDAOImpl();
    
	@Before
	public void setUp() throws Exception {
	}

	@Test
	/*public void testFindSubjectByID() {
		Subject subject=new Subject();
		subject=sd.findSubjectByID(1);
		assertEquals(subject.getSubjectTitle(),"大熊猫是哪国的？");
		fail("Not yet implemented");
	}*/
	/*public void testUpdateSubject(){
		Subject subject=new Subject();
		subject.setSubjectID(5);
		subject.setSubjectTitle("5+1=?");
		subject.setSubjectParse("简单题");
		subject.setSubjectOptionA("4");
		subject.setSubjectOptionB("5");
		subject.setSubjectOptionC("6");
		subject.setSubjectOptionD("7");
		subject.setSubjectAnswer("C");
		sd.updateSubject(subject);
	}*/
	public void testUpdateSubject(){
		sd.deleteSubject(5);
    }
}
