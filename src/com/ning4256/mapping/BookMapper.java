package com.ning4256.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ning4256.pojo.Book;

public interface BookMapper {

    
    //使用@Insert注解指明add方法要执行的SQL
//    @Insert("insert into book(book_name, book_author, book_price, book_publish, book_date, book_des,book_count) values(#{book_name}, #{book_author}, #{book_price}, #{book_publish}, #{book_date}, #{book_des},#{book_count})")
    public int addBook(Book book);
    
    //使用@Delete注解指明deleteById方法要执行的SQL
//    @Delete("delete from users where user_id=#{user_id}")
    public int deleteBookById(int book_id);
    
    //使用@Update注解指明update方法要执行的SQL
//    @Update("update users set user_pass=#{user_pass} where user_id=#{user_id}")
//    public int updateBookBy(Users users);
    
    //使用@Select注解指明getById方法要执行的SQL
//    @Select("select * from users where user_id=#{user_id}")
    public Book getBookById(int book_id);
    
    //使用@Select注解指明getAll方法要执行的SQL
//    @Select("select * from users")
    public List<Book> getAllBook();
}
