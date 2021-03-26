package com.xdxiaoran.service;

import com.xdxiaoran.mapper.AdminMapper;
import com.xdxiaoran.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;

    public List<Admin> getAllAdmins(){
        return  adminMapper.getAllAdmin();
    }
    public Admin getOneAdmin(int id){
        return  adminMapper.getOneAdmin(id);
    }
    public void deleteOneAdmin(int id){
        adminMapper.deleteOneAdmin(id);
    }
    public void insertOneAdmin(Admin admin){
        adminMapper.insertOneAdmin(admin);
    }
    public void updateOneAdminNameById(Admin admin){
        adminMapper.updateOneAdminNameById(admin);
    }
}
