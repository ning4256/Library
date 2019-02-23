package com.ning4256.pojo;

public class Users {
	private int   user_id;
	private String   user_acc;
	private String   user_pass;
	private int   user_borrow_id;
	private String   user_name;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_acc() {
		return user_acc;
	}
	public void setUser_acc(String user_acc) {
		this.user_acc = user_acc;
	}
	public String getUser_pass() {
		return user_pass;
	}
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public int getUser_borrow_id() {
		return user_borrow_id;
	}
	public void setUser_borrow_id(int user_borrow_id) {
		this.user_borrow_id = user_borrow_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_acc=" + user_acc + ", user_pass=" + user_pass + ", user_borrow_id="
				+ user_borrow_id + ", user_name=" + user_name + "]";
	}
	
	
}
