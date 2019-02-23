package com.ning4256.service;

import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;

import com.ning4256.dao.UserDAO;
import com.ning4256.dao.loginDAO;
import com.ning4256.mapping.AllMapper;
import com.ning4256.mapping.BookMapper;
import com.ning4256.mapping.UserMapper;
import com.ning4256.pojo.Book;
import com.ning4256.pojo.Borrow;
import com.ning4256.pojo.LoginPo;
import com.ning4256.pojo.Users;
import com.ning4256.utils.MyBatisUtil;


public class UserService implements UserMapper, BookMapper, AllMapper{
	SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
    //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    BookMapper mapper2 = sqlSession.getMapper(BookMapper.class);
    AllMapper mapper3 = sqlSession.getMapper(AllMapper.class);
	

	@Override
	public int addUser(Users users) {
		return mapper.addUser(users);
	}

	@Override
	public int deleteUserById(int id) {
		return mapper.deleteUserById(id);
	}

	@Override
	public int updateUser(Users users) {
		return mapper.updateUser(users);
	}

	@Override
	public Users getUserById(int user_id) {
		return mapper.getUserById(user_id);
	}

	@Override
	public List<Users> getAllUser() {
		return mapper.getAllUser();
	}

	@Override
	public int addBook(Book book) {
		return mapper2.addBook(book);
	}

	@Override
	public int deleteBookById(int book_id) {
		return mapper2.deleteBookById(book_id);
	}

	@Override
	public Book getBookById(int book_id) {
		return mapper2.getBookById(book_id);
	}

	@Override
	public List<Book> getAllBook() {
		return mapper2.getAllBook();
	}


	//获得用户的id
	@Override
	public int getUserId(Users users) {
		return mapper3.getUserId(users);
	}

	//根据用户获得他的借书id
	@Override
	public List<Borrow> getBorrowIdByUserId(Users users) {
		return mapper3.getBorrowIdByUserId(users);
	}

	//根据他的借书集合获取他的图书集合
	@Override
	public List<Book> getBookIdByBorrowId(List<Borrow> list) {
		return mapper3.getBookIdByBorrowId(list);
	}

	//根据图书集合获取他的图书
	@Override
	public Book getBookByBookId(List<Book> books) {
		return mapper3.getBookByBookId(books);
	}

	//根据用户id直接获取七图书信息
	@Override
	public Book getBookByUserId(int user_id) {
		return mapper3.getBookByBookId(mapper3.getBookIdByBorrowId(mapper3.getBorrowIdByUserId(mapper3.getUserById(user_id))));
	}

	@Override
	public List<Book> getBooks999(Users users) {
		return mapper3.getBooks999(users);
	}

//	loginDAO ld = new loginDAO();
//	UserDAO ud = new UserDAO();
//	//获取用户登录信息
//	public Users login(String user_acc, String user_pass) {
//		Users upo = null;
//		LoginPo user = ld.findLoginUserById(user_acc);
//		if()){
//			upo = ud.findUserById(user_acc);
//		}
//		return upo;
//	}



	

}
