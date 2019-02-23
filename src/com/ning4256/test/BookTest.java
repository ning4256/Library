package com.ning4256.test;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ning4256.mapping.BookMapper;
import com.ning4256.mapping.UserMapper;
import com.ning4256.pojo.Book;
import com.ning4256.pojo.Users;
import com.ning4256.utils.MyBatisUtil;

public class BookTest {
	public static void main(String[] args) {
		new BookTest().testAdd();
		new BookTest().testDelete();
		
	}
   
    public void testAdd(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book = new Book();
        book.setBook_author("章口就莱");
        book.setBook_name("文体两开花");
        book.setBook_count(21);
        Date date = new Date(2021, 1, 1);
        book.setBook_date(date);
        book.setBook_des("伍川最爱书籍");
        book.setBook_price(21);
        book.setBook_publish("中美合拍出版社");
        System.out.println(book);
        int add = mapper.addBook(book);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(add);
    }
    
//    
//    public void testUpdate(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
//        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Users user = new Users();
//        user.setUser_id(1);
//        user.setUser_pass("mima");
//        //执行修改操作
//        int retResult = mapper.update(user);
//        //使用SqlSession执行完SQL之后需要关闭SqlSession
//        sqlSession.close();
//        System.out.println(retResult);
//    }
//    
//    
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        //执行删除操作
        int retResult = mapper.deleteBookById(2);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }
//    
//    
//    public void testGetUser(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        //执行查询操作，将查询结果自动封装成User返回
//        Users user = mapper.getById(1);
//        //使用SqlSession执行完SQL之后需要关闭SqlSession
//        sqlSession.close();
//        System.out.println(user);
//    }
//    
//    
//    public void testGetAll(){
//        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        //执行查询操作，将查询结果自动封装成List<User>返回
//        List<Users> lstUsers = mapper.getAll();
//        //使用SqlSession执行完SQL之后需要关闭SqlSession
//        sqlSession.close();
//        System.out.println(lstUsers);
//    }
}
