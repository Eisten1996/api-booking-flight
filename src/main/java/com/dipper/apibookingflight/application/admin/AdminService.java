package com.dipper.apibookingflight.application.admin;

import com.dipper.apibookingflight.domain.admin.model.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAll();

    Admin getAdmin(String id);

    Admin createAdmin(Admin admin);

    Admin updateAdmin(Admin admin);

    void deleteAdmin(String id);
}
