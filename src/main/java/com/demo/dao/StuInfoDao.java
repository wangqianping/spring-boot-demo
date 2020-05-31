package com.demo.dao;

import com.demo.entity.StuInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StuInfoDao {

    @Select("select * from stuInfo where id = #{id}")
    StuInfo getById(long id);

    @Update("update stuInfo set stu_name=#{stuName},gender=#{gender},age=#{age},majorId=#{majorId} where id = #{id}")
    void update(StuInfo stuInfo);

    @Delete("delete from stuInfo where id = #{id}")
    void delete(long id);
}
