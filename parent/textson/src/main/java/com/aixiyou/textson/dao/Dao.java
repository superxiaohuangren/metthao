package com.aixiyou.textson.dao;


import com.aixiyou.textson.pojo.Text;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface Dao {
    @Insert("insert into text values(#{text.id},#{text.name},#{text.pwd},#{text.sex})")
    int getall(@Param("text") Text text);

    @Select("select name,pwd from text where name=#{name} and pwd=#{pwd}")
    Text get(@Param("name") String name, @Param("pwd") String pwd);
}
