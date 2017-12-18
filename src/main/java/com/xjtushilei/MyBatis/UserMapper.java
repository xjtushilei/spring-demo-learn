package com.xjtushilei.MyBatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user ")
    public List<User> getall();


    @Select("select * from user where id = #{id}")
    public User getById(long id);


    @Select("select name from user where id = #{id}")
    public String getNameById(long id);
}
