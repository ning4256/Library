package com.ning4256.pojo;

public class Borrow {
	private int   user_id;
	private int   book_id;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	@Override
	public String toString() {
		return "Borrow [user_id=" + user_id + ", book_id=" + book_id + "]";
	}
	
}
