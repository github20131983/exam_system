package exam_system;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wyj.service.StudentService;
import com.wyj.service.StudentServiceImpl;

public class StudentServiceImplTest {
    
	private StudentService ss=new StudentServiceImpl();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(ss.allowLogin("1", "20131983"), true);
		assertEquals(ss.allowLogin("2", "20131988"), false);
	}

}
