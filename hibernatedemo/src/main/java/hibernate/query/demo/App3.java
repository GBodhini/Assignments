package hibernate.query.demo;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;

import com.bodh.hibernate.entity.Address2;
import com.bodhini.hiberante.util.HibernateUtil;

public class App3 
{
	public static void main(String[] args)
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Session session=factory.openSession();
		Criteria crt=session.createCriteria(Address2.class);
		crt.addOrder(Order.asc("stateName"));
		List<Address2> list=crt.list();
		for(Address2 a:list)
		{
			System.out.println(a.getAddressId()+" "+a.getHouseNo()+" "+a.getStreetName()+" "+a.getCityName()+" "+a.getStateName());;
		}
		/*Query<Address2> qry=session.createNamedQuery("getAllAddress",Address2.class);
		List<Address2> alist=qry.getResultList();
		for(Address2 a:alist)
		{
			System.out.println(a.getAddressId()+" "+a.getHouseNo()+" "+a.getStreetName());
			System.out.println(a.getCityName()+" "+a.getStateName());
			System.out.println();
		}*/
		/*Query qry=session.createSQLQuery("select * from address");
		List<Object[]> list=qry.list();
		for(Object[] obj:list)
		{
			for(Object o:obj)
				System.out.print(o+" ");
			System.out.println();
		}*/
		session.close();
		HibernateUtil.shutdown();
		
	}
}
