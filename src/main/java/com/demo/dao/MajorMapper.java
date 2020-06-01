package com.demo.dao;

import com.demo.entity.Major;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MajorMapper {

    @Select("select * from major where id = #{id}")
    Major getById(long id);

}
