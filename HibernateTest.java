package hibernatedemo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernatedemo.pojo.Employee;

public class HibernateTest {

	public static void main(String[] args) {

		
		//step 1. read all the configuration from hibernate.cfg.xml file.
		Configuration config = new Configuration().configure("myhibernate.cfg.xml");
		//if you change the name of cfg file the mention it into configure function as above
		System.out.println(config);
		
		//SessionFactory is interface which object created by the Configuration object.
		SessionFactory factory = config.buildSessionFactory();
		
		
		//Now using SessionFactory object we are creating session to perform transactions on database
		
		Session session = factory.openSession();
		
		//Create Transaction object using session object.
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpId(103);
		emp.setEmpName("Rakesh");
		emp.setEmpSalary(25000);
		
		session.save(emp);
		
		transaction.commit();
		System.out.println("Row Inserted Successfully...");
		session.close();
		
		factory.close();
	}

}
