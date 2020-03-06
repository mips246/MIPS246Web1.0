package com.ryan.mips246spring.model;

/**
 * @author Ryan
 * @date 2020/3/1 20:38
 */
public class Course {
    private String courseid;
    private String coursename;
    private Integer studentcount;
    private String createtime;

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Integer getStudentcount() {
        return studentcount;
    }

    public void setStudentcount(Integer studentcount) {
        this.studentcount = studentcount;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseid='" + courseid + '\'' +
                ", coursename='" + coursename + '\'' +
                ", studentcount='" + studentcount + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}
