package com.bodh.bootdemo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



import com.bodh.bootdemo.entity.Department;
import com.bodh.bootdemo.entity.Employee;
import com.bodh.bootdemo.repository.BookDAO;
import com.bodh.bootdemo.repository.DepartmentDAO;
import com.bodh.bootdemo.service.DepartmentService;

@SpringBootApplication
public class BootdemoApplication {
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext container=SpringApplication.run(BootdemoApplication.class, args);
		/*Person p=container.getBean(Person.class);
		System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
		System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreet());
		System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());
		*/
		
		/*Employee e=container.getBean(Employee.class);
		System.out.println(e.getSsn()+" "+e.getName()+" "+e.getMobile());
		System.out.println(e.getGender()+" "+e.getAge());
		System.out.println(e.getDepartment().getDeptno()+" "+e.getDepartment().getDeptname()+" "+e.getDepartment().getLocation());
		*/
		
		/*System.out.println("-----------------------------");
		BookDAO bookdao=container.getBean(BookDAO.class);
		List<Book> books=bookdao.findAll();
		for(Book b:books)
			System.out.println(b.getBookId()+" "+b.getBookTitle()+" "+b.getBookAuthor()+" "+b.getBookcategory()+" "+b.getBookPrice()+" "+b.getAvailableCopies());
		System.out.println("-------------------------------");*/
		
		/*BookDAO bookdao=container.getBean(BookDAO.class);
		Book b=new Book("HCPP","How to CPP","Detel","C++",700,10);
		bookdao.save(b);*/
		
		/*BookDAO bookdao=container.getBean(BookDAO.class);
		Optional<Book> b=bookdao.findById("TCP");
		System.out.println("----------------------------");
		if(b.isPresent())
		{
			Book b1=b.get();
			System.out.println(b1.getBookTitle()+" "+b1.getBookAuthor()+" "+b1.getBookcategory()+" "+b1.getBookPrice()+" "+b1.getAvailableCopies());
		}
		else
			System.out.println("Bool with id TCP does not exist");
		System.out.println("--------------------------------");*/
	
		/*BookDAO bookdao=container.getBean(BookDAO.class);
		List<Book> blist=bookdao.findByBookCategory("CPP");
		for(Book b1:blist)
			System.out.println(b1.getBookTitle()+" "+b1.getBookAuthor()+" "+b1.getBookCategory()+" "+b1.getBookPrice()+" "+b1.getAvailableCopies());*/
	
		/*BookDAO bookdao=container.getBean(BookDAO.class);
		System.out.println("---------------------------------");
		List<Book> blist=bookdao.findByBookAuthor("Detel");
		for(Book b1:blist)
			System.out.println(b1.getBookTitle()+" "+b1.getBookAuthor()+" "+b1.getBookCategory()+" "+b1.getBookPrice()+" "+b1.getAvailableCopies());
		System.out.println("------------------------------------");*/
	
		/*DepartmentDAO ddao=container.getBean(DepartmentDAO.class);
		Optional<Department> d= ddao.findById(20);
		if(d.isPresent())
		{
			Department d1=d.get();
			System.out.println(d1.getDepartmentNo()+" "+d1.getDepartmentName()+" "+d1.getLocation());
			for(Employee e:d1.getEmployees())
				System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
		}*/
		
		DepartmentService ddao=container.getBean(DepartmentService.class);
		Department d= ddao.getDepartmentByDepartmentId(20);
			System.out.println(d.getDepartmentNo()+" "+d.getDepartmentName()+" "+d.getLocation());
			for(Employee e:d.getEmployees())
				System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getSalary());
		}
	
}
