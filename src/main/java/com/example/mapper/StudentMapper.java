package com.example.mapper;

import com.example.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {

    @Select("select*from student")
    public List<Student>selectStudentAll();
    @Select("select * from student where id=#{id}")
    public Student selectIDStudent(int id);
    @Select("select * from student where name=#{name}")
    public List<Student> selectNameStudent(String name);
    @Insert("insert into student(id,name,age,sex) values(#{id},#{name},#{age},#{sex})")
    public int addStudent(Student student);
    @Update("update Student set id=#{id},name=#{name},sex=#{sex},age=#{age}")
    public int updateStudent(Student student);
    @Delete("delect from student where id=#{id}")
    public int deleteUser(int id);
}
