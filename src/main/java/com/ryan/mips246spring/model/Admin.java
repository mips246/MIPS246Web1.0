package com.ryan.mips246spring.model;

import java.io.Serializable;

/**
 * @author Ryan
 * @date 2020/3/1 10:48
 */
public class Admin implements Serializable {
    private String userid;
    private String username;
    private String password;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isValid(String pwd) {
        if(pwd.equals(password)) {
            return true;
        }
        return false;
    }
}
