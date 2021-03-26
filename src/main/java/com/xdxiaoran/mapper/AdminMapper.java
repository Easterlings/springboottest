package com.xdxiaoran.mapper;

import com.xdxiaoran.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AdminMapper {
    List<Admin>getAllAdmin();
    Admin getOneAdmin(int id);
    void deleteOneAdmin(int id);
    void insertOneAdmin(Admin admin);
    void updateOneAdminNameById(Admin admin);
}
