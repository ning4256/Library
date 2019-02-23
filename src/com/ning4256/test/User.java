package com.ning4256.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ning4256.mapping.UserMapper;
import com.ning4256.pojo.Users;
import com.ning4256.utils.MyBatisUtil;

public class User {
	public static void main(String[] args) {
		new User().testAdd();
//		new User().testGetAll();
//		new User().testDelete();
//		new Test2().testGetUser();
//		new Test2().testUpdate();
	}
   
    public void testAdd(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Users users= new Users();
        users.setUser_name("测试专用1");
        users.setUser_acc("Test");
        users.setUser_pass("123456");
        int add = mapper.addUser(users);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(add);
    }
    
    
    public void testUpdate(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Users user = new Users();
        user.setUser_id(1);
        user.setUser_pass("mima");
        //执行修改操作
        int retResult = mapper.updateUser(user);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }
    
    
    public void testDelete(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession(true);
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //执行删除操作
        int retResult = mapper.deleteUserById(2);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(retResult);
    }
    
    
    public void testGetUser(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //执行查询操作，将查询结果自动封装成User返回
        Users user = mapper.getUserById(2);
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(user);
    }
    
    
    public void testGetAll(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //得到UserMapperI接口的实现类对象，UserMapperI接口的实现类对象由sqlSession.getMapper(UserMapperI.class)动态构建出来
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //执行查询操作，将查询结果自动封装成List<User>返回
        List<Users> lstUsers = mapper.getAllUser();
        //使用SqlSession执行完SQL之后需要关闭SqlSession
        sqlSession.close();
        System.out.println(lstUsers);
    }
}