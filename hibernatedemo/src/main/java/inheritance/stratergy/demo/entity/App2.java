package inheritance.stratergy.demo.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bodhini.hiberante.util.HibernateUtil;


public class App2 
{	
	public static void main(String[] args)
	{
		 SessionFactory factory=HibernateUtil.buildSessionFactory();
		 Session session=factory.openSession();
		 SalariedEmployee se=new SalariedEmployee(101,"Ajay",15000);
		 HourlyWagesEmployee hwe=new HourlyWagesEmployee(102,"Dinesh",45,500);
		Transaction trans=session.beginTransaction();
		session.save(se);
		session.save(hwe);
		trans.commit();
		 session.close();
		 HibernateUtil.shutdown();
	}

}
