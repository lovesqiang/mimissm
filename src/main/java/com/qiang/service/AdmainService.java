package com.qiang.service;

import com.qiang.pojo.Admin;

public interface AdmainService {

    //完成登录判断
    Admin login(String name,String pwd);

}
