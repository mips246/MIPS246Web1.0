package com.ryan.mips246spring.biz;

import com.ryan.mips246spring.model.Admin;
import com.ryan.mips246spring.model.exception.LoginRegisterException;
import com.ryan.mips246spring.service.AdminService;
import com.ryan.mips246spring.service.StudentService;
import com.ryan.mips246spring.service.TeacherService;
import com.ryan.mips246spring.utils.MD5;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ryan
 * @date 2020/3/1 14:20
 */
@Service
public class LoginBiz {
    @Autowired
    private AdminService adminService;
//    @Autowired
//    private TeacherService teacherService;
//    @Autowired
//    private StudentService studentService;

    public boolean login(String userid,String password,String role) {
        if (role.equals("admin")) {
            Admin admin = adminService.getAdmin(userid);
            //!StringUtils.equals(MD5.next(password),admin.getPassword())
            if (!password.equals(admin.getPassword()))
                return false;
        }
        return true;
    }
}
