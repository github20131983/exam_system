package exam_system;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wyj.hibernate.HibernateSessionFactory;
import com.wyj.po.Student;

import junit.framework.TestCase;

public class TestSql extends TestCase {
	public static void main(String[] args) {  
        Session session=HibernateSessionFactory.getSession();  
        Transaction t=session.beginTransaction();  

        Student s1=new Student();
        s1.setStudentID("were12ew");
        s1.setName("wyq");
        s1.setPassword("123456");
        s1.setResult(100);
        s1.setSclass("1A");

        t.commit();
        session.close();  
        System.out.println("successfully saved");  
	}
}
