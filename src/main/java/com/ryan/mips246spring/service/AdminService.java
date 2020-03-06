package com.ryan.mips246spring.service;

import com.ryan.mips246spring.dao.AdminDao;
import com.ryan.mips246spring.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Ryan
 * @date 2020/3/1 14:46
 */
@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin getAdmin(String userid){
        return adminDao.findUserByUserId(userid);
    }
}
