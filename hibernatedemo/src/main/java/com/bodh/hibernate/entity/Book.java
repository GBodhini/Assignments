package com.bodh.hibernate.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Book
{
@Id
@Column(name="book_id")
private String bookId;
@Column(name="book_Title")
private String bookTitle;
@Column(name="book_author")
private String bookAuthor;
@Column(name="book_category")
private String bookCategory;
private double book_price;
private int copies;
public Book(){}
public Book(String bookId, String bookTitle, String bookAuthor, String bookCategory, double book_price, int copies) {
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.bookAuthor = bookAuthor;
	this.bookCategory = bookCategory;
	this.book_price = book_price;
	this.copies = copies;
}
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getBookAuthor() {
	return bookAuthor;
}
public void setBookAuthor(String bookAuthor) {
	this.bookAuthor = bookAuthor;
}
public String getBookCategory() {
	return bookCategory;
}
public void setBookCategory(String bookCategory) {
	this.bookCategory = bookCategory;
}
public double getBook_price() {
	return book_price;
}
public void setBook_price(double book_price) {
	this.book_price = book_price;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}


}

    

 