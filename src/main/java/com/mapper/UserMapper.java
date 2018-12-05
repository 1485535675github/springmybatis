package com.mapper;

import com.model.Person;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
 
    @Select("SELECT * FROM Person WHERE id = #{id}")
    Person selectUser(@Param("id") int id);
}