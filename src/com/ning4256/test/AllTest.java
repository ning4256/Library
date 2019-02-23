package com.ning4256.test;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ning4256.mapping.AllMapper;
import com.ning4256.pojo.Book;
import com.ning4256.pojo.Users;
import com.ning4256.utils.MyBatisUtil;

public class AllTest {
public static void main(String[] args) {
	
	AllTest.testUserId();
}

public static void testUserId() {
    SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
    //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
    AllMapper mapper = sqlSession.getMapper(AllMapper.class);
    Users users = new Users();
	users.setUser_id(1);
    List<Book> list = mapper.getBooks999(users);
    //使用SqlSession执行完SQL之后需要关闭SqlSession
    sqlSession.close();
    System.out.println(list);
}
}
