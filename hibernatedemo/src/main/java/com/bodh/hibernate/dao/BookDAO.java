package com.bodh.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bodh.hibernate.entity.Book;
import com.bodh.hibernate.entity.Employee;

public class BookDAO {

	SessionFactory factory=null;
	public BookDAO(SessionFactory factory)
	{
		this.factory=factory;
	}
	public void insertEmployee(Book book)
	{
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		try
		{
			session.save(book);
			trans.commit();
		}
		catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
	}
	public void deleteBook(Book book)
	{
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		try
		{
			session.save(book);
			trans.commit();
		}
		catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
	}
	
	public void modifyBook(Book book)
	{
		Session session=factory.openSession();
		Transaction trans=session.beginTransaction();
		try
		{
			session.update(book);
			trans.commit();
		}
		catch(Exception ex)
		{
			trans.rollback();
			ex.printStackTrace();
		}
	}
	public Book getBook(String book_id)
	{
		Session session = factory.openSession();
		return session.get(Book.class, book_id);
	}
}

