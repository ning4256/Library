package com.ning4256.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Book implements Serializable{
	 private int   book_id;
	 private String  book_name;
	 private String  book_author;
	 private int  book_price;
	 private String  book_publish;
	 private Date  book_date;
	 private String  book_des;
	 private int  book_count;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	public int getBook_price() {
		return book_price;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public String getBook_publish() {
		return book_publish;
	}
	public void setBook_publish(String book_publish) {
		this.book_publish = book_publish;
	}
	public Date getBook_date() {
		return book_date;
	}
	public void setBook_date(Date book_date) {
		this.book_date = book_date;
	}
	public String getBook_des() {
		return book_des;
	}
	public void setBook_des(String book_des) {
		this.book_des = book_des;
	}
	public int getBook_count() {
		return book_count;
	}
	public void setBook_count(int book_count) {
		this.book_count = book_count;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_author=" + book_author
				+ ", book_price=" + book_price + ", book_publish=" + book_publish + ", book_date=" + book_date
				+ ", book_des=" + book_des + ", book_count=" + book_count + "]";
	}
	 
	
}
