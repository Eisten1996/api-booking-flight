package com.dipper.apibookingflight.web.controllers;

import com.dipper.apibookingflight.application.admin.AdminService;
import com.dipper.apibookingflight.domain.admin.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class AdminApiController implements AdminApi {

    @Autowired
    AdminService adminService;

    @Override
    public ResponseEntity<List<Admin>> getAdmins() {
        return new ResponseEntity<>(adminService.getAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Admin> getAdmin(String id) {
        return new ResponseEntity<>(adminService.getAdmin(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Admin> createAdmin(Admin admin) {
        return new ResponseEntity<>(adminService.createAdmin(admin), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Admin> updateAdmin(Admin admin) {
        return new ResponseEntity<>(adminService.updateAdmin(admin), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> deleteAdmin(String id) {
        adminService.deleteAdmin(id);
        return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
    }
}
