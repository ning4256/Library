package com.ning4256.mapping;

import java.util.List;

import com.ning4256.pojo.Book;
import com.ning4256.pojo.Borrow;
import com.ning4256.pojo.Users;
import com.ning4256.test.User;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public interface AllMapper {

    
    public int addBook(Book book);
    
    public int deleteBookById(int book_id);
    
    public Book getBookById(int book_id);
    
    public List<Book> getAllBook();
    
    public int addUser(Users users);
    
    public int deleteUserById(int id);
    
    public int updateUser(Users users);
    
    public Users getUserById(int user_id);
    
    public List<Users> getAllUser();
    //根据用户获得用户id
    public int getUserId(Users users);
    //根据用户id获得借书id
//    public int getBorrowIdByUserId(Users users);
    public List<Borrow> getBorrowIdByUserId(Users users);
    //根据他的借书id集合获取他的图书集合
    public List<Book> getBookIdByBorrowId(List<Borrow> list);
    
    //根据他的图书集合获取图书
    public Book getBookByBookId(List<Book> books);
    
    //根据用户id获取他的借阅图书信息
    public Book getBookByUserId(int user_id);
    
    public List<Book> getBooks999(Users users);
}
