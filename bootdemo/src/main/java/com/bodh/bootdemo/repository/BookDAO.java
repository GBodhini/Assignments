package com.bodh.bootdemo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bodh.bootdemo.entity.Book;

public interface BookDAO extends JpaRepository<Book,String>
{
	Optional<Book> findByBookTitle(String bookTitle);
	List<Book> findByBookCategory(String bookCategory);
	List<Book> findByBookAuthor(String bookAuthor);
	
}
