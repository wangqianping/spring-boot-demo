package com.demo.dao;

import com.demo.entity.StuInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface StuInfoDao {

    @Select("select * from stuInfo where id = #{id}")
    StuInfo getById(long id);


}
