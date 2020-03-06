package com.ryan.mips246spring.model;

/**
 * @author Ryan
 * @date 2020/3/1 20:41
 */
public class Teacher {
    private String teacherid;
    private String teachername;
    private String password;
    private String description;

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherid='" + teacherid + '\'' +
                ", teachername='" + teachername + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
