package com.mapper;

import com.model.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
 
    @Select("SELECT * FROM Person WHERE id = #{id}")
    Person selectUser(@Param("id") int id);
}