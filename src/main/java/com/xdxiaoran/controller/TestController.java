package com.xdxiaoran.controller;

import com.xdxiaoran.mapper.AdminMapper;
import com.xdxiaoran.pojo.Admin;
import com.xdxiaoran.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class TestController {
    @Autowired
    AdminService adminService;
    @Autowired
    AdminMapper adminMapper;
    @GetMapping("/get")
    public List<Admin> getAll(){
        List<Admin> allAdmins = adminService.getAllAdmins();
        return allAdmins;
    }
    @GetMapping("/get/{id}")
    public  Admin getOneAdmin(@PathVariable("id") int id){
        return  adminService.getOneAdmin(id);
    }
    @GetMapping("/delete/{id}")
    public void deleteOneAdmin(@PathVariable("id") int id){
        adminService.deleteOneAdmin(id);
    }
    @GetMapping("/insert/{id}/{name}/{account}/{password}")
    public void insertOneAdmin(@PathVariable("id")int id,@PathVariable("name")String name,@PathVariable("account")String account,@PathVariable("password")String password){
        Admin admin = new Admin(id,name,account, password);
        adminService.insertOneAdmin(admin);
    }
    @GetMapping("/update/{id}/{name}")
    public void insertOneAdmin(@PathVariable("id")int id,@PathVariable("name")String name){
        Admin admin = new Admin(id,name,"account", "password");
        adminService.updateOneAdminNameById(admin);
    }
}
