package com.qiang.service.Impl;

import com.qiang.mapper.AdminMapper;
import com.qiang.pojo.Admin;
import com.qiang.pojo.AdminExample;
import com.qiang.service.AdmainService;
import com.qiang.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmainServiceImpl implements AdmainService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String name, String pwd) {

        AdminExample example = new AdminExample();

        example.createCriteria().andAdninNameEqualTo(name);

        //select * from admin where admin_name=#{name},
        List<Admin> list=adminMapper.selectByExample(example);

        //先判断数据库admin表中有没有用户输入的名称
        if (list.size()>0){
            Admin admin = list.get(0);
            //将用户输入的明文变成密文
            String mipwd = MD5Util.getMD5(pwd);

            //再判断密码是否正确
            if (mipwd.equals(admin.getAdminPassword())){
                return admin;
            }
        }

        return null;
    }
}
