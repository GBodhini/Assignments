package com.bodh.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bodh.hibernate.dao.BookDAO;
//import com.bodh.hibernate.dao.BookDAO;
import com.bodh.hibernate.dao.EmployeeDAO;
import com.bodh.hibernate.entity.Address;
import com.bodh.hibernate.entity.Book;
import com.bodh.hibernate.entity.Course;
import com.bodh.hibernate.entity.Department;
import com.bodh.hibernate.entity.Employee;
import com.bodh.hibernate.entity.Person;
import com.bodh.hibernate.entity.Student;
import com.bodhini.hiberante.util.HibernateUtil;

public class App 
{
    public static void main( String[] args )
    {
    	//Many to Many
    	SessionFactory factory=HibernateUtil.buildSessionFactory();
    	Session session=factory.openSession();
    	Course c=session.get(Course.class, "Core Java");
    	if(c!=null)
    	{
    		System.out.println(c.getCourseName()+"  "+c.getCourseDuration());
    		System.out.println(c.getCoursefee()+" "+c.getFacultyName());
    		for(Student s:c.getStudents())
    			System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
    	}
    	System.out.println("-----------------------------------------------------------");
    		Student s=session.get(Student.class,8001);
    		if(s!=null)
    		{
    			System.out.println(s.getStudentName()+" "+s.getMobileNo()+" "+s.getStudentAddress());
    			for(Course c1:s.getCourses())
    			{
    				System.out.println(c1.getCourseName()+" "+c1.getCoursefee());
    				System.out.println(c1.getCourseDuration()+" "+c1.getFacultyName());
    				System.out.println();
    			}
    		
    		}
    		session.close();
        	HibernateUtil.shutdown();
    }
}
    	

    /*SessionFactory factory=HibernateUtil.buildSessionFactory();
    	Session session=factory.openSession();
    	
    	Book b=session.get(Book.class,"TCP");
    	Transaction trans=session.beginTransaction();
    	if(b!=null)
    	{
    		System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor());
    		System.out.println(b.getBook_price()+" "+b.getBookCategory()+" "+b.getCopies());
    	}
    	
    	//Adding books to sql
    	//Book b1=new Book("3","hello","SMITH","c",100,10);
    	
    	//session.save(b1);
    	BookDAO bdao=new BookDAO(factory);
    	Book b2=session.get(Book.class, "COD");
    
    	bdao.modifyBook(new Book("DOC","hello","SMITH","D",125,40));
    	
    	//deleting books
      //  session.delete(b1);
        trans.commit();
    	session.close();
    	HibernateUtil.shutdown();
    }
    
    
}*/

    	
   
//one to many
/*Department d=session.get(Department.class,20);
if(d!=null)
{
	System.out.println(d.getDepartmentName()+" "+ d.getLocation());
	for(Employee e:d.getEmployees())
		System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
	
}
Employee e=session.get(Employee.class, 102);
if(e!=null)
{
	System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
	System.out.println(e.getDepartment().getdepartmentNo()+ " "+e.getDepartment().getDepartmentName());
	System.out.println(e.getDepartment().getLocation());
}
*/



/*SessionFactory factory=HibernateUtil.buildSessionFactory();
Session session=factory.openSession();
Department d=session.get(Department.class, 10);
Transaction trans=session.beginTransaction();
if(d!=null)
	session.delete(d);
trans.commit();
session.close();
HibernateUtil.shutdown();*/


















//one to Many
/*SessionFactory factory=HibernateUtil.buildSessionFactory();
Session session=factory.openSession();
Department d=session.get(Department.class,10);
if(d!=null)
{
	System.out.println(d.getdepartmentNo()+" "+d.getDepartmentName());
	for(Employee e:d.getEmployees())
		System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
}

session.close();
HibernateUtil.shutdown();
    	*/
    	
    	
    	//one to one//
    	/*SessionFactory factory=HibernateUtil.buildSessionFactory();
    	Session session=factory.openSession();
    	Address a= new Address(7004,"9-9-9","AB Street","Secundrabd","Telangana");
    	Person p=new Person(789,"Dinesh Karthik",29,'M',a);
    	Transaction trans = session.beginTransaction();
    	session.save(a);
    	session.save(p);
    	trans.commit();
    	session.close();
    	HibernateUtil.shutdown();/*
    	
    	
    	
    	
    	//BiDirectional//
    	/*SessionFactory factory=HibernateUtil.buildSessionFactory();
    	Session session=factory.openSession();
    	Person p=session.get(Person.class, 787);
    	if(p!=null)
    	{
    		System.out.println(p.getSsn()+" "+p.getPersonName()+" "+p.getPersonAge()+p.getGender());
    		System.out.println(p.getAddress().getHouseNo()+" "+p.getAddress().getStreetName());
    		System.out.println(p.getAddress().getCityName()+" "+p.getAddress().getStateName());   	    
    	}
    	Address a=session.get(Address.class,7001);
    	if(a!=null)
    	{
    		System.out.println(a.getHouseNo()+" "+a.getStreetName());
    		System.out.println(a.getCityName()+" "+a.getStateName());  
    		System.out.println(a.getPerson().getSsn()+" "+a.getPerson().getPersonName());
    		System.out.println(a.getPerson().getPersonAge()+" "+a.getPerson().getGender());
    	}
    	
    	BookDAO bdao=new BookDAO(factory);
    	bdao.insertBook(new Book(110,"bodh","Sahith","Bio",100.0,10));
    	
    	Book b=bdao.getBook(2);
    	
    	/*Session session1=factory.openSession();
         Transaction transaction = session.beginTransaction();
    	Book book = new Book(110,"bodh","Sahith","Bio",100.0,10);
        Book book1 = new Book(111,"Sah","Bodh","Bio",200.0,20);
        Book book2 = new Book(112,"BOSAH","BS","Epic",300.0,30);
        Book book3 = new Book();
       
        session.save(book1);
        session.save(book2);
        session.save(book3);
    	//Book b=session.get(Book.class,2);
    	if(b!=null)
    	{
    	System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor());
    	System.out.println(b.getBookPrice()+" "+b.getBookCategory()+" "+b.getCopies());
    	session.close();
    	HibernateUtil.shutdown();
    	
    }*/


























/*Session session=factory.openSession();
Transaction trans=session.beginTransaction();
Employee e= session.get(Employee.class,105);
if(e!=null)
	session.delete(e);
else
	System.out.println("Employee with id 105 does not exist");
//e.setEmployeeId(102);
//session.delete(e);
trans.commit();
session.close();
if(e!=null)
	e.setEmployeeName("Babu Raja");
System.out.println("is Session Dirty " + session.isDirty());
	trans.commit();
	System.out.println("is Session Dirty " + session.isDirty());
session.close();
Employee e=new Employee(103,"Charan",30000,10);
Employee e1=new Employee(104,"Dinesh",40000,20);
Employee e2=new Employee(105,"Zoohan",20000,30);
Transaction trans=session.beginTransaction();
session.save(e);
session.save(e1);
session.save(e2);
trans.commit();

EmployeeDAO edao=new EmployeeDAO(factory);
    	edao.insertEmployee(new Employee(104,"Dinesh Karthik",4000,40));
    	Employee e=edao.getEmployee(103);
    	if(e!=null)
    		System.out.println(e.getEmployeeName()+"  "+e.getSalary()+" "+e.getDepartmentNo());
    	//edao.modifyEmployee(new Employee(103,"Ram Charan",3300,33));
    	//edao.deleteEmployee(new Employee(101," ",0,0));


*/