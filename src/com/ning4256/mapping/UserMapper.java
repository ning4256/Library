package com.ning4256.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ning4256.pojo.Users;


/**
 * @author gacl
 * 定义sql映射的接口，使用注解指明方法要执行的SQL
 */
public interface UserMapper {
    //使用@Insert注解指明add方法要执行的SQL
//    @Insert("insert into users(user_name, user_acc, user_pass) values(#{user_name}, #{user_acc},#{user_pass})")
    public int addUser(Users users);
    
    //使用@Delete注解指明deleteById方法要执行的SQL
//    @Delete("delete from users where user_id=#{user_id}")
    public int deleteUserById(int id);
    
    //使用@Update注解指明update方法要执行的SQL
//    @Update("update users set user_pass=#{user_pass} where user_id=#{user_id}")
    public int updateUser(Users users);
    
    //使用@Select注解指明getById方法要执行的SQL
//    @Select("select * from users where user_id=#{user_id}")
    public Users getUserById(int user_id);
    
    //使用@Select注解指明getAll方法要执行的SQL
//    @Select("select * from users")
    public List<Users> getAllUser();
    
}
