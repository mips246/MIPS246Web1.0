package com.ryan.mips246spring;

import com.ryan.mips246spring.dao.AdminDao;
import com.ryan.mips246spring.model.Admin;
import com.ryan.mips246spring.model.Course;
import com.ryan.mips246spring.model.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Mips246springApplicationTests {

    @Autowired
    private AdminDao adminDao;
    @Test
    void contextLoads() {
    }
    @Test
    public void test_AdminDao_findUserByUserId(){
        Admin admin = adminDao.findUserByUserId("admin");
        System.out.println(admin.getPassword()+" "+admin.getUserid()+" "+admin.getUsername());
    }
    @Test
    public void test_AdminDao_getCourseList(){
        List<Course> courseList = adminDao.getCourseList();
        for(Course course:courseList){
            System.out.println(course);
        }
    }
    @Test
    public void test_AdminDao_getTeacherList(){
        List<Teacher> teacherList = adminDao.getTeacherList();
        for(Teacher teacher:teacherList){
            System.out.println(teacher);
        }
    }
    @Test
    public void test_AdminDao_InsertCourse(){
        Course course=new Course();
        course.setCourseid("CS193303");
        course.setCoursename("线性代数");
        course.setCreatetime("2020-3-1");
        course.setStudentcount(120);
        adminDao.insertCourse(course);
    }
    @Test
    public void test_AdminDao_deleteCourse(){
        adminDao.deleteCourse("CS193303");
    }
}
