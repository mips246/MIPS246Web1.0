package com.ryan.mips246spring.dao;

import com.ryan.mips246spring.model.Admin;
import com.ryan.mips246spring.model.Course;
import com.ryan.mips246spring.model.Student;
import com.ryan.mips246spring.model.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Ryan
 * @date 2020/3/1 13:59
 */
@Mapper
public interface AdminDao {

    @Select("select * from admin where userid=#{userid}")
    public Admin findUserByUserId(String userid);
    @Select("select * from course")
    public List<Course> getCourseList();
    @Select("SELECT * FROM teacher")
    public List<Teacher> getTeacherList();
    @Select("select * from student")
    public List<Student> getStudentList();
    @Insert("insert into course values(#{courseid},#{coursename},#{studentcount},#{createtime})")
    public void insertCourse(Course course);
    @Delete("delete from course where courseid=#{courseid}")
    public void deleteCourse(String courseid);
    @Insert("insert into student values(#{userid},#{name},#{password})")
    public void insertStudent(Student student);
    @Delete("delete from student where userid=#{userid}")
    public void deleteStudent(String userid);
    @Insert("insert into teacher values(#{teacherid},#{teachername},#{password},#{description})")
    public void insertTeacher(Teacher teacher);
    @Delete("delete from teacher where teacherid=#{teacherid}")
    public void deleteTeacher(String teacherid);
}
